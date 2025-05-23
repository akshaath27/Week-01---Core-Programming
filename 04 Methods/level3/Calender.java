import java.util.Scanner;
import java.util.Calendar;

public class Calender {
    public static void displayCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\n   " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.ENGLISH) + " " + year);
        for (String day : days) {
            System.out.print(day + " ");
        }
        System.out.println();

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
        
        displayCalendar(month, year);
    }
}
