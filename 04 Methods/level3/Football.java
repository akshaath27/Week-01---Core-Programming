import java.util.Random;

public class Football {
    
    public static int[] generatePlayerHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Generates height between 150 and 250 cm
        }
        return heights;
    }
    
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    
    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }
    
    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }
    
    public static void main(String[] args) {
        int teamSize = 11;
        int[] heights = generatePlayerHeights(teamSize);
        
        System.out.println("Player heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        System.out.println("Mean height: " + findMeanHeight(heights) + " cm");
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cm");
    }
}
