import java.util.Scanner;

public class d5q12
 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an angle in degrees: ");
            double angle = scanner.nextDouble();
            
            double[] results = calculateTrigonometricFunctions(angle);
            System.out.printf("Sine: %.4f%n", results[0]);
            System.out.printf("Cosine: %.4f%n", results[1]);
            System.out.printf("Tangent: %.4f%n", results[2]);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
