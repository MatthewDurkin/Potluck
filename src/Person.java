
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Person {
    private String name;
    private String allergy;
    private String diet;
    private ArrayList<PDate> available;
    private ArrayList<PDate> unavailable;

    public Person() {
        this.name = null;
        this.allergy = null;
        this.diet = null;
        this.available = new ArrayList();
        this.unavailable = new ArrayList();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getDiet() {
        return diet;
    }

    public String getAllergy() {
        return allergy;
    }


    public void addAvailable(PDate date) {
        if(this.unavailable.isEmpty()) {
            this.available.add(date);
        }
        else {
            //throw exception
        }
    }

    public void addUnavailable(PDate date) {
        if(this.available.isEmpty()) {
            this.unavailable.add(date);
        }
        else {
            //throw exception
        }
    }

    public ArrayList<PDate> getAvailable() {

        if(this.available.isEmpty()) {
            Collections.sort(this.unavailable, new DateSortByMonth());
            PDate s = this.unavailable.remove(0);
            for (PDate d: this.unavailable) {
                //calendar day of year
                if (s.getCalendar_s().get(Calendar.DAY_OF_YEAR) == d.getCalendar_s().get(Calendar.DAY_OF_YEAR)){
                    if (s.getE_hour() > d.getE_hour()) {
                        if (s.getE_hour() != 22) {
                            this.available.add(new PDate(d.getMonth(), d.getDay(), s.getE_hour(), s.getE_min(), 22, 0, false, d.getYear()));
                        }
                    }
                    else {
                        if (s.getE_hour() != 22) {
                            this.available.add(new PDate(d.getMonth(), d.getDay(), d.getE_hour(), d.getE_min(), 22, 22, false, d.getYear()));
                        }
                    }
                }
                else {
                    if(s.getYear() == d.getYear()) {
                        if ((d.getCalendar_s().get(Calendar.DAY_OF_YEAR) - s.getCalendar_s().get(Calendar.DAY_OF_YEAR)) == 1) {
                            if (s.getE_hour() < 22) {
                                this.available.add(new PDate(s.getMonth(), s.getDay(), s.getE_hour(), s.getE_min(), 22, 0, false, s.getYear()));
                            }
                            if (d.getS_hour() > 9) {
                                this.available.add(new PDate(d.getMonth(), d.getDay(), 9, 0, d.getS_hour(), d.getS_min(), false, s.getYear()));
                            }
                        }
                        else {
                            if (s.getE_hour() != 22) {
                                this.available.add(new PDate(s.getMonth(), s.getDay(), s.getE_hour(), s.getE_min(), 22, 0, false, d.getYear()));
                            }
                            int dif = d.getCalendar_s().get(Calendar.DAY_OF_YEAR) - s.getCalendar_s().get(Calendar.DAY_OF_YEAR);
                            int i = s.getDay();
                            int m = s.getCalendar_s().get(Calendar.DAY_OF_YEAR);
                            int j = 1;
                            Calendar cal = Calendar.getInstance();
                            cal.set(Calendar.YEAR, s.getYear());
                            cal.set(Calendar.DAY_OF_YEAR , s.getCalendar_s().get(Calendar.DAY_OF_YEAR));
                            if (dif > 30) {
                                while(j < 30) {
                                    cal.set(Calendar.DAY_OF_YEAR, m+j);
                                    this.available.add(new PDate(cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 9, 0, 22, 0, true, cal.get(Calendar.YEAR)));
                                    j++;
                                }
                                break;
                            }
                            else {
                                while (dif >= 1) {
                                    i++;
                                    cal.set(Calendar.DAY_OF_YEAR, m + j);
                                    if (dif == 1) {
                                        this.available.add(new PDate(cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 9, 0, d.getS_hour(), d.getS_min(), false, d.getYear()));
                                    } else {
                                        this.available.add(new PDate(cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0, true, s.getYear()));
                                    }
                                    j++;
                                    dif--;
                                }
                            }
                        }
                    }
                    else {
                        Calendar cal = Calendar.getInstance();
                        cal.set(Calendar.YEAR, s.getYear());
                        cal.set(Calendar.MONTH, 12);
                        cal.set(Calendar.DAY_OF_MONTH, 31);
                        int add = cal.get(Calendar.DAY_OF_YEAR);

                        int dif = d.getCalendar_s().get(Calendar.DAY_OF_YEAR) - s.getCalendar_s().get(Calendar.DAY_OF_YEAR) + add;
                        int i = s.getDay();
                        if (dif > 30) {
                            break;
                        }
                        while (dif >= 1) {
                            i++;
                            if (dif == 1) {
                                this.available.add(new PDate(d.getMonth(), d.getDay(), 9, 0, d.getS_hour(), d.getS_min(), false, d.getYear()));
                            } else {
                                if (i - add > 0) {
                                    Calendar cal1 = Calendar.getInstance();
                                    cal1.set(Calendar.YEAR, s.getYear());
                                    cal1.set(Calendar.DAY_OF_YEAR, i - add);

                                    this.available.add(new PDate(d.getMonth(), cal1.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0, true, d.getYear()));
                                } else {
                                    Calendar cal2 = Calendar.getInstance();
                                    cal2.set(Calendar.YEAR, s.getYear());
                                    cal2.set(Calendar.DAY_OF_YEAR, i);

                                    this.available.add(new PDate(s.getMonth(), cal2.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0, true, s.getYear()));
                                }
                            }
                            dif--;
                        }
                    }
                }
                s = d;
            }
        }
        Collections.sort(this.available, new DateSortByMonth());
        return this.available;
    }

}