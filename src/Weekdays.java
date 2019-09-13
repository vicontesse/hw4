import java.util.Calendar;
import java.util.TimeZone;

public class Weekdays {
    public enum WeekDay{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY

    }
    public static void main(String args[]) {
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        int currentDay = localCalendar.get(Calendar.DAY_OF_WEEK);
        System.out.print("Today is ");
        switch (currentDay){
            case 2: WeekDay mon = WeekDay.valueOf("MONDAY");
                System.out.println(mon);
                break;
            case 3: WeekDay tue = WeekDay.valueOf("TUESDAY");
                System.out.println(tue);
                break;
            case 4: WeekDay wed = WeekDay.valueOf("WEDNESDAY");
                System.out.println(wed);
                break;
            case 5: WeekDay thur = WeekDay.valueOf("THURSDAY");
                System.out.println(thur);
                break;
            case 6: WeekDay fri = WeekDay.valueOf("FRIDAY");
                System.out.println(fri);
                break;
            case 7: WeekDay sat = WeekDay.valueOf("SATURDAY");
                System.out.println(sat);
                break;
            case 1: WeekDay sun = WeekDay.valueOf("SUNDAY");
                System.out.println(sun);
                break;
        }
    }
}


