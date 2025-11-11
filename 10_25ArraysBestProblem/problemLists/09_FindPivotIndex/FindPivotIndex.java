
public class FindPivotIndex {
     static int findPivotIdx(int[] arr){
          int leftSum = 0;
          int rightSum = 0;
          int totalSum = 0;

          for(int i : arr){
               totalSum = totalSum + i;

          }
          System.out.println("Here is the total sum -> "+ totalSum);

          for(int i = 0; i<arr.length; i++){
               if(i>0)leftSum += arr[i-1];

               rightSum = totalSum - arr[i] - leftSum;

               // System.out.println("LeftSum -> "+ leftSum + " RightSum -> "+rightSum);
               if(leftSum == rightSum){
                    return i;
               }
          }
          return -1;
     }
   public static void main(String[] args) {
     int arr[] = {1, 7, 3, 6, 5, 6};
     int pivot = findPivotIdx(arr);
     System.out.println("Here is your pivot index -> "+pivot);
   }  
}
