
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Person {
    private String name;
    private ArrayList diet;
    private String cuisine;
    private ArrayList<String> type;
    private ArrayList<Date> available;
    private ArrayList<Date> unavailable;

    public Person() {
        this.name = null;
        this.diet = new ArrayList();
        this.cuisine = null;
        this.type = new ArrayList();
        this.available = new ArrayList();
        this.unavailable = new ArrayList();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(ArrayList diet) {
        int j = 0;
        if((diet.size() + this.diet.size()) <= 7) {
            for (int i = 0; i < diet.size(); i++) {
                this.diet.add(diet.get(i));
            }
        }
        else {
            System.out.println("Error: unable to set diet, array input is too long.");
        }
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setType(ArrayList<String> type) {
        int j = 0;
        if((type.size() + this.type.size()) <= 7) {
            for (int i = 0; i < type.size(); i++) {
                this.type.add(type.get(i));
            }
        }
        else {
            System.out.println("Error: unable to set type, array input is too long.");
        }
    }

    public void addAvailable(Date date) {
        if(this.unavailable.isEmpty()) {
            this.available.add(date);
        }
        else {
            //throw exception
        }
    }

    public void addUnavailable(Date date) {
        if(this.available.isEmpty()) {
            this.unavailable.add(date);
        }
        else {
            //throw exception
        }
    }

    public ArrayList<Date> getAvailable() {
        if(this.available.isEmpty()) {
            Collections.sort(this.unavailable, new DateSortByMonth());
            Date s = this.unavailable.remove(0);
            for (Date d: this.unavailable) {
                //calendar day of year
                if (s.getCalendar_s().get(Calendar.DAY_OF_YEAR) == d.getCalendar_s().get(Calendar.DAY_OF_YEAR)){
                    this.available.add(new Date(d.getMonth(), d.getDay(), s.getE_hour(), s.getE_min(), d.getS_hour(), s.getS_min(), false, d.getYear()));
                }
                else {
                    if(s.getYear() == d.getYear()) {
                        if ((d.getCalendar_s().get(Calendar.DAY_OF_YEAR) - s.getCalendar_s().get(Calendar.DAY_OF_YEAR)) <= 1) {
                            if (s.getE_hour() < 22) {
                                this.available.add(new Date(s.getMonth(), s.getDay(), s.getE_hour(), s.getE_min(), 22, 0, false, s.getYear()));
                            }
                            if (d.getS_hour() > 9) {
                                this.available.add(new Date(d.getMonth(), d.getDay(), 9, 0, d.getS_hour(), d.getS_min(), false, s.getYear()));
                            }
                        }
                        else {
                            int dif = d.getCalendar_s().get(Calendar.DAY_OF_YEAR) - s.getCalendar_s().get(Calendar.DAY_OF_YEAR);
                            int i = s.getDay();
                            if (dif > 30) {
                                break;
                            }
                            while (dif >= 1) {
                                i++;
                                if (s.getMonth() == d.getMonth()) {
                                    if (dif == 1) {
                                        this.available.add(new Date(d.getMonth(), d.getDay(), 9, 0, d.getS_hour(), d.getS_min(), false, d.getYear()));
                                    }
                                    else {
                                        this.available.add(new Date(s.getMonth(), i, 0, 0, 0, 0, true, s.getYear()));
                                    }
                                    dif --;
                                }
                                else {
                                    if (dif == 1) {
                                        this.available.add(new Date(d.getMonth(), d.getDay(), 9, 0, d.getS_hour(), d.getS_min(), false, d.getYear()));
                                    }
                                    else {
                                        Calendar cal = Calendar.getInstance();
                                        cal.set(Calendar.YEAR, s.getYear());
                                        cal.set(Calendar.DAY_OF_YEAR, i);

                                        this.available.add(new Date(s.getMonth(), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0, true, s.getYear()));
                                    }
                                    dif --;
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
                                this.available.add(new Date(d.getMonth(), d.getDay(), 9, 0, d.getS_hour(), d.getS_min(), false, d.getYear()));
                            } else {
                                if (i - add > 0) {
                                    Calendar cal1 = Calendar.getInstance();
                                    cal1.set(Calendar.YEAR, s.getYear());
                                    cal1.set(Calendar.DAY_OF_YEAR, i - add);

                                    this.available.add(new Date(d.getMonth(), cal1.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0, true, d.getYear()));
                                } else {
                                    Calendar cal2 = Calendar.getInstance();
                                    cal2.set(Calendar.YEAR, s.getYear());
                                    cal2.set(Calendar.DAY_OF_YEAR, i);

                                    this.available.add(new Date(s.getMonth(), cal2.get(Calendar.DAY_OF_MONTH), 0, 0, 0, 0, true, s.getYear()));
                                }
                            }
                            dif--;
                        }
                    }
                }
                s = d;
            }
        }
        return this.available;
    }

}