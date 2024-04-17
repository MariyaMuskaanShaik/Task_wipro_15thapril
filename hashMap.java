import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers that add up to target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store indices of elements
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement for the current element
            int complement = target - nums[i];
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // Return the indices of the current element and its complement
                return new int[]{map.get(complement), i};
            }
            // Add the current element and its index to the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found, return null
        return null;
    }
}
