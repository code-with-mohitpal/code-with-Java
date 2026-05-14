import java.util.*;

public class MaxDuplicateElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {

            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        // Find maximum duplicate element
        int maxCount = 0;
        int maxElement = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        // Output
        System.out.println("Maximum Duplicate Element: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}
