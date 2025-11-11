

public class MaxConSecOnes{

     static int findMaxConSecOnes(int[]arr){
          int maxCount = 0;
          int count = 0;
          for(int i = 0; i<arr.length; i++){
               if(arr[i]==1){
                    count++;
               }else{
                    count=0;
               }
               // System.out.println("count value -> "+ count);
               if(maxCount<count){
                    maxCount = count;
               }
          }
          return maxCount;
     }
     public static void main(String[] args) {
          int [] arr  = {1,0,1,1,0,1,1,1};
          int maxConSecOne = findMaxConSecOnes(arr);
          System.out.println("Here is the max conSec ones -> "+ maxConSecOne);
     }
}