import java.util.Scanner;

public class marks_students_10 {
    public static char[] getgrade(double[][] tot_avg_percent, int count) {
        char[] grade = new char[count];
        for (int i = 0; i < count; i++) {
            if (tot_avg_percent[i][2] <= 39.0) {
                grade[i] = 'R';
            } else if (tot_avg_percent[i][2] <= 49.0) {
                grade[i] = 'E';
            } else if (tot_avg_percent[i][2] <= 59.0) {
                grade[i] = 'D';
            } else if (tot_avg_percent[i][2] <= 69.0) {
                grade[i] = 'C';
            } else if (tot_avg_percent[i][2] <= 79.0) {
                grade[i] = 'B';
            } else {
                grade[i] = 'A';
            }
        }
        return grade;
    }

    public static double[][] total_average_percentage(int[][] marks, int count) {
        double[][] tot_avg_percent = new double[count][3];
        for (int i = 0; i < count; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            double percentage = ((marks[i][0] + marks[i][1] + marks[i][2]) / 300.0) * 100;

            tot_avg_percent[i][0] = Math.round(total * 100.0) / 100.0;
            tot_avg_percent[i][1] = Math.round(average * 100.0) / 100.0;
            tot_avg_percent[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return tot_avg_percent;
    }

    public static int[][] getrandommarks(int count) {
        int[][] marks = new int[count][3];
        for (int i = 0; i < count; i++) {
            marks[i][0] = (int) (Math.random() * 101);
            marks[i][1] = (int) (Math.random() * 101);
            marks[i][2] = (int) (Math.random() * 101);
        }
        return marks;
    }

    public static void showScorecard(int[][] marks, double[][] tot_avg_percent, char[] grade, int count) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | % | Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-7d | %-7d | %-9d | %-4d | %-5.2f | %-7.2f | %-5.2f | %-5s\n",
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], 
                              tot_avg_percent[i][0], tot_avg_percent[i][1], tot_avg_percent[i][2], 
                              grade[i]);
        }

        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int count = input.nextInt();

        int[][] marks = marks_students_10.getrandommarks(count);
        double[][] tot_avg_percent = marks_students_10.total_average_percentage(marks, count);
        char[] grade = marks_students_10.getgrade(tot_avg_percent, count);
        marks_students_10.showScorecard(marks, tot_avg_percent, grade, count);

        input.close();
    }
}