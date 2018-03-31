import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;

public class Date {
    private int month;
    private int day;
    private int year;
    private int s_hour;
    private int s_min;
    private int e_hour;
    private int e_min;
    private boolean allday;
    private Calendar calendar_s;
    private Calendar calendar_e;

    public Date(int month, int day, int s_hour, int s_min, int e_hour, int e_min, boolean allday, int year){
        this.year = year;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if( day > 0 && day <= 31) {
                    this.month = month;
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("Error in creating object Date: integer for day must be between 1 and 31 for month input.");
                    //throw exeption
                    break;
                }
            case 2:
                if( day > 0 && day <= 28) {
                    this.month = month;
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("Error in creating object Date: integer for day must be between 1 and 28 for feb.");
                    //throw exeption
                    break;
                }
            case 4: case 6: case 9: case 11:
                if( day > 0 && day <= 30) {
                    this.month = month;
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("Error in creating object Date: integer for day must be between 1 and 30 for month input.");
                    //throw exeption
                    break;
                }
            default:
                System.out.println("Error in creating object Date: integer for month must be between 1 and 12.");
                //throw exeption
                break;
        }
        if (allday){
            this.allday = allday;

            calendar_s.set(Calendar.HOUR_OF_DAY, 0);
            calendar_s.set(Calendar.MINUTE, 0);

            calendar_e.set(Calendar.HOUR_OF_DAY, 23);
            calendar_e.set(Calendar.MINUTE, 59);
        }
        else {
            if (s_hour < e_hour) {
                this.s_hour = s_hour;
                this.e_hour = e_hour;
                this.s_min = s_min;
                this.e_min = e_min;

            } else if (s_hour == e_hour) {
                this.s_hour = s_hour;
                this.e_hour = e_hour;
                if (s_min <= e_min) {
                    this.s_min = s_min;
                    this.e_min = e_min;
                }
            }
            calendar_s.set(Calendar.HOUR_OF_DAY, s_hour);
            calendar_s.set(Calendar.MINUTE, s_min);

            calendar_e.set(Calendar.HOUR_OF_DAY, e_hour);
            calendar_e.set(Calendar.MINUTE, e_min);

        }

        calendar_s.set(Calendar.YEAR, year);
        calendar_s.set(Calendar.MONTH, month);
        calendar_s.set(Calendar.DAY_OF_MONTH, day);

    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getS_hour() {
        return s_hour;
    }

    public int getE_hour() {
        return e_hour;
    }

    public int getS_min() {
        return s_min;
    }

    public int getE_min() {
        return e_min;
    }

    public boolean isAllday() {
        return allday;
    }

    public Calendar getCalendar_e() {
        return calendar_e;
    }

    public Calendar getCalendar_s() {
        return calendar_s;
    }

    public static boolean isValidDate(int month, int day, int year) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String inDate = year + "-" + month + "-" + day;

        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
}

class DateSortByDay implements Comparator <Date> {

    public int compare(Date date1, Date date2) {
        if (date1.getDay() > date2.getDay())
            return 1;
        else if (date1.getDay() < date2.getDay())
            return -1;

        return 0;
    }
}

class DateSortByMonth implements Comparator <Date> {

    public int compare(Date date1, Date date2) {
        DateSortByDay dsd = new DateSortByDay();

        if (date1.getMonth() > date2.getMonth())
            return 1;
        else if (date1.getMonth() < date2.getMonth())
            return -1;

        return dsd.compare(date1, date2);
    }
}