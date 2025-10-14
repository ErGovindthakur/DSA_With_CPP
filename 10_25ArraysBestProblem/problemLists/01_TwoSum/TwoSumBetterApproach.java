import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
     HashMap<Integer, Integer> map = new HashMap<>();

     int[] twoSum(int[] nums, int target) {
          for (int i = 0; i < nums.length; i++) {
               int diff = target - nums[i];
               if (map.containsKey(diff)) {
                    return new int[] { map.get(diff), i };
               }
               map.put(nums[i], i);
          }
          return null;
     }
}

public class TwoSumBetterApproach {
     public static void main(String[] args) {
          System.out.println("Working");

          TwoSum sum = new TwoSum();
          int[] nums = { 2, 7, 11, 15 };
          int target = 9;

          int[] result = sum.twoSum(nums, target);
          System.out.println("Indices are: " + Arrays.toString(result));
     }
}
