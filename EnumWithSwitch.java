
public class EnumWithSwitch {

    public enum Day {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String args[]) {

        Day[] daysOfWeek = Day.values();

        for (Day today : daysOfWeek) {

            //Using Enum in Switch case statement

            switch (today) {
                case MONDAY:
                    System.out.println("Today is Monday");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday");
                    break;
                case FRIDAY:
                    System.out.println("Friday");
                    break;
                case SATURDAY:
                    System.out.println("Saturday");
                    break;
                case SUNDAY:
                    System.out.println("Sunday");
                    break;

            }
        }
    }
}
