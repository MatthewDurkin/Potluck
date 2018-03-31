import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        return A;
    }

}