import java.util.Scanner;

public class d5q11 {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the temperature (in Fahrenheit): ");
            double temperature = scanner.nextDouble();
            
            System.out.print("Enter the wind speed (in mph): ");
            double windSpeed = scanner.nextDouble();
            
            if (temperature > 50 || windSpeed < 3) {
                System.out.println("Wind chill formula is only valid for temperatures ≤ 50°F and wind speeds ≥ 3 mph.");
            } else {
                double windChill = calculateWindChill(temperature, windSpeed);
                System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
