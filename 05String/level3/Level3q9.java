import java.util.Scanner;
public class Level3q9 {
    private static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        displayCalendar(year, month);
        scanner.close();
    }
    public static void displayCalendar(int year, int month) {
        System.out.println(monthNames[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDayOfWeek = getFirstDayOfWeek(year, month);
        int daysInCurrentMonth = getDaysInMonth(year, month);
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInCurrentMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static int getDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return daysInMonth[month - 1];
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getFirstDayOfWeek(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
}
