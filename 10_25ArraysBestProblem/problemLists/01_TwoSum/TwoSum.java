
public class TwoSum {
     public static void main(String[] args) {
          int[] nums = { 2, 7, 11, 15 };
          int target = 9;
          boolean found = false;
          for (int i = 0; i < nums.length; i++) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                         System.out.println("Indices -> " + i + "," + j);
                         System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                         ;
                         found = true;
                    }
               }
          }
          if (!found) {
               System.out.println("No pair found for target " + target);
          }
     }
}
