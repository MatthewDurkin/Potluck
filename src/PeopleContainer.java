import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class PeopleContainer {
    ArrayList<Person> PeopleList = new ArrayList();
    ArrayList<Date> dates = new ArrayList();

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.YEAR);
    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);

    int hour  = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);

    public void init_dates() {
        for(Person p: PeopleList) {
            for(Date d: p.getAvailable()) {
                dates.add(d);
            }
        }
    }

    public ArrayList<Date> schedule(int month, int day, int year) {
        ArrayList<Date> A = new ArrayList<>();
        System.out.println(dateFormat.format(cal)); //2016/11/16 12:08:43
        Calendar rightNow = Calendar.getInstance();

        Date now = new Date(rightNow.get(Calendar.MONTH), rightNow.get(Calendar.DAY_OF_MONTH), rightNow.get(Calendar.HOUR_OF_DAY), rightNow.get(Calendar.MINUTE), 23, 59, false, rightNow.get(Calendar.YEAR));

        int num_ppl = PeopleList.size();

        for (Person p: PeopleList) {
            for(Date d: p.getAvailable()) {
                this.dates.add(d);
            }
        }

        Collections.sort(this.dates, new DateSortByMonth());

        DateSortByMonth comp = new DateSortByMonth();

        for (Date d: this.dates) {
            if(comp.compare(now, d) == 1 ) {
                this.dates.remove(d);
            }
            else {
                break;
            }
        }


        int i = 0;
        Date d;

        while(i < this.dates.size()) {
            DateSortByHourStart comp_hour_start = new DateSortByHourStart();
            DateSortByHourEnd comp_hour_end = new DateSortByHourEnd();
            if(A.isEmpty()) {
                if(this.dates.get(i).getYear() == this.dates.get(i+1).getYear()) {
                    if(this.dates.get(i).getCalendar_s().get(Calendar.DAY_OF_YEAR) == this.dates.get(i+1).getCalendar_s().get(Calendar.DAY_OF_YEAR)) {
                        if (comp_hour_end.compare(this.dates.get(i), this.dates.get(i+1)) == -1){
                            A.add(new Date(this.dates.get(i).getMonth(), this.dates.get(i).getDay(), this.dates.get(i+1).getS_hour(), this.dates.get(i+1).getS_min(), this.dates.get(i).getE_hour(), this.dates.get(i).getE_min(), false, this.dates.get(i).getYear());
                            i++;
                        }
                    }
                }
            }
            else {
                if(A.get(-1).getYear() == this.dates.get(i+1).getYear()) {
                    if(A.get(-1).getCalendar_s().get(Calendar.DAY_OF_YEAR) == this.dates.get(i+1).getCalendar_s().get(Calendar.DAY_OF_YEAR)) {
                        if (comp_hour_end.compare(A.get(-1), this.dates.get(i+1)) == -1){
                            A.add(new Date(A.get(-1).getMonth(), A.get(-1).getDay(), this.dates.get(i+1).getS_hour(), this.dates.get(i+1).getS_min(), A.get(-1).getE_hour(), A.get(-1).getE_min(), false, A.get(-1).getYear());
                        }
                    }
                }
            }

        }
        return A;
    }

}