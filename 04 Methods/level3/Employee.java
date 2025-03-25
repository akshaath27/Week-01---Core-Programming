import java.util.Scanner;

public class Employee {
    public static final int NUM_EMPLOYEES = 10;
    
    public static double[][] generateEmployeeData() {
        double[][] data = new double[NUM_EMPLOYEES][2];
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            data[i][0] = 30000 + Math.random() * 70000; // Salary between 30,000 and 100,000
            data[i][1] = 1 + Math.random() * 10; // Years of service between 1 and 10
        }
        return data;
    }

    public static double[][] calculateBonuses(double[][] employeeData) {
        double[][] updatedData = new double[NUM_EMPLOYEES][3];
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    public static void displayResults(double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("\nEmployee Salary Data:");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
        
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonuses(employeeData);
        displayResults(updatedData);
    }
}