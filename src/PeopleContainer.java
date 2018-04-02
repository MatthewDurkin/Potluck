
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class PeopleContainer {
    public static ArrayList<Person> PeopleList = new ArrayList();
    public static ArrayList<Date> dates = new ArrayList();
    public static ArrayList<Date> overlap_dates = new ArrayList();

    public static void addPerson(Person P) {
        PeopleList.add(P);
    }

    public static void init_dates() {
        for(Person p: PeopleList) {
            for(Date d: p.getAvailable()) {
                dates.add(d);
            }
        }
    }

    public static ArrayList<Date> schedule() {
        ArrayList<Date> A = new ArrayList<>();
        Calendar rightNow = Calendar.getInstance();

        Date now = new Date(rightNow.get(Calendar.MONTH), rightNow.get(Calendar.DAY_OF_MONTH), rightNow.get(Calendar.HOUR_OF_DAY), rightNow.get(Calendar.MINUTE), 23, 59, false, rightNow.get(Calendar.YEAR));

        int num_ppl = PeopleList.size();

        for (Person p: PeopleList) {
            for(Date d: p.getAvailable()) {
                dates.add(d);
            }
        }

        Collections.sort(dates, new DateSortByMonth());
        System.out.println(dates.get(0).getCalendar_s().get(Calendar.DAY_OF_YEAR));
        System.out.println(dates.get(0).getCalendar_s().get(Calendar.HOUR));
        System.out.println(dates.get(1).getCalendar_s().get(Calendar.DAY_OF_YEAR));
        System.out.println(dates.get(1).getCalendar_s().get(Calendar.HOUR));
        System.out.println(dates.get(2).getCalendar_s().get(Calendar.DAY_OF_YEAR));
        System.out.println(dates.get(2).getCalendar_s().get(Calendar.HOUR));
        System.out.println(dates.get(3).getCalendar_s().get(Calendar.DAY_OF_YEAR));
        System.out.println(dates.get(3).getCalendar_s().get(Calendar.HOUR));

        DateSortByMonth comp = new DateSortByMonth();

        for (Date d: dates) {
            if(comp.compare(now, d) == 1 ) {
                dates.remove(d);
            }
            else {
                break;
            }
        }


        int i = 0;
        int num_sets = 0;

        while(i < dates.size()) {
            DateSortByHourEnd comp_hour_end = new DateSortByHourEnd();
            // error is here
            if(A.isEmpty()) {
                if(dates.get(i).getYear() == dates.get(i+1).getYear()) {
                    if(dates.get(i).getCalendar_s().get(Calendar.DAY_OF_YEAR) == dates.get(i+1).getCalendar_s().get(Calendar.DAY_OF_YEAR)) {
                        if (comp_hour_end.compare(dates.get(i), dates.get(i+1)) == -1){
                            A.add(new Date(dates.get(i).getMonth(), dates.get(i).getDay(), dates.get(i+1).getS_hour(), dates.get(i+1).getS_min(), dates.get(i).getE_hour(), dates.get(i).getE_min(), false, dates.get(i).getYear()));
                            i++;
                            num_sets++;
                        }
                        else {
                            A.add(dates.get(i+1));
                            i++;
                            num_sets++;
                        }
                    }
                    else {
                        A.add(dates.get(i+1));
                        i++;
                        num_sets++;
                    }
                }
                else {
                    A.add(dates.get(i+1));
                    i++;
                    num_sets++;
                }
            }
            else {
                if(A.get(A.size()-1).getYear() == dates.get(i).getYear()) {
                    if(A.get(A.size()-1).getCalendar_s().get(Calendar.DAY_OF_YEAR) == dates.get(i).getCalendar_s().get(Calendar.DAY_OF_YEAR)) {
                        if (comp_hour_end.compare(A.get(A.size()-1), dates.get(i)) == -1){
                            A.add(new Date(A.get(A.size()-1).getMonth(), A.get(A.size()-1).getDay(), dates.get(i+1).getS_hour(), dates.get(i+1).getS_min(), A.get(A.size()-1).getE_hour(), A.get(A.size()-1).getE_min(), false, A.get(A.size()-1).getYear()));
                            A.remove(0);
                            num_sets++;
                        }
                        else if(comp_hour_end.compare(A.get(A.size()-1), dates.get(i)) == -1) {
                            i++;
                            num_sets++;
                        }
                        else if(comp_hour_end.compare(A.get(A.size()-1), dates.get(i)) == 1) {
                            A.add(dates.get(i));
                            A.remove(0);
                            i++;
                            num_sets++;
                        }
                        if (num_ppl == num_sets) {
                            overlap_dates.add(A.get(0));
                            A.remove(0);
                            i++;
                            num_sets = 0;
                        }
                    }
                    else {
                        A.remove(0);
                        i++;
                        num_sets = 0;
                    }
                }
                else {
                    A.remove(0);
                    i++;
                    num_sets = 0;
                }
            }

        }
        return A;
    }

    public static void main(String[] args){
        Date d0 = new Date(9, 20, 9, 0, 20, 30, false, 2017);
        Date d1 = new Date(9, 20, 9, 0, 23, 59, true, 2017);
        Date d2 = new Date(9, 19, 9, 0, 23, 59, true, 2017);
        Date d3 = new Date(9, 19, 14, 0, 20, 59, false, 2017);

        Person p1 = new Person();
        Person p2 = new Person();
        p2.addUnavailable(d0);
        p2.addUnavailable(d3);
        p1.addAvailable(d1);
        p1.addAvailable(d2);

        addPerson(p2);
        addPerson(p1);

        init_dates();
        ArrayList<Date> av_d = schedule();
    }

}