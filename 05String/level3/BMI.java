import java.util.Scanner;
import java.util.Random;

public class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMIStatus(double[][] persons) {
        String[][] results = new String[persons.length][4];
        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double height = persons[i][1];
            double bmi = calculateBMI(weight, height);
            results[i][0] = String.format("%.2f", height);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = getBMIStatus(bmi);
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] persons = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = scanner.nextDouble();
        }
        
        String[][] results = computeBMIStatus(persons);
        displayResults(results);
        
        scanner.close();
    }
}
