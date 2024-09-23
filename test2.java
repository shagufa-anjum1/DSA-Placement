import java.util.Scanner;
import java.util.PriorityQueue;
public class test2 {
        public static int minTimeToCollectAllCandies(int[] candyBoxes) {
            // Create a priority queue (min-heap) to store the number of candies in each box
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            // Add all candy boxes to the min-heap
            for (int candies : candyBoxes) {
                minHeap.add(candies);
            }

            int totalTime = 0;

            // Continue until there's only one box left in the heap
            while (minHeap.size() > 1) {
                // Extract the two smallest boxes
                int box1 = minHeap.poll();
                int box2 = minHeap.poll();

                // Combine them
                int combinedBox = box1 + box2;

                // Add the time taken for this combination
                totalTime += combinedBox;

                // Push the combined box back into the heap
                minHeap.add(combinedBox);
            }

            return totalTime;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the number of test cases
            System.out.println("Enter the number of test cases:");
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                // Get the number of candy boxes
                System.out.println("Enter the number of candy boxes for test case " + (i + 1) + ":");
                int n = scanner.nextInt();

                // Create an array to store the number of candies in each box
                int[] candyBoxes = new int[n];
                System.out.println("Enter the number of candies in each box:");
                for (int j = 0; j < n; j++) {
                    candyBoxes[j] = scanner.nextInt();
                }

                // Calculate the minimum time to collect all candies
                int result = minTimeToCollectAllCandies(candyBoxes);
                System.out.println("Minimum time to collect all candies: " + result);
            }

            scanner.close();
        }
    }


