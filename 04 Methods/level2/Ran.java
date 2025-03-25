import java.util.Scanner;
import java.util.Random;

public class Ran {
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates 4-digit number
        }
        return numbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
    
    public static void main(String[] args) {
        int size = 5;
        int[] numbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        double[] results = findAverageMinMax(numbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}