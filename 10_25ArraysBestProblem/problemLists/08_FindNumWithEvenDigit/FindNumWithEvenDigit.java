public class FindNumWithEvenDigit {
     static int evenDigitNum(int []arr){
          int evnCount = 0;
          for(int i = 0; i<arr.length; i++){
               int count = 0;
               int div = arr[i];
               while(div>0){
                    div = div/10;
                    count++;
                    // System.out.println("Here is the count value -> "+count);
               }
               if(count%2==0){
                    // System.out.println("MaxCount Updated here...");
                    evnCount = evnCount + 1;
               }
          }
          return evnCount;
     }
     public static void main(String[] args) {
     //    int [] arr = {12,345,2,6,7896};
        int [] arr = {437,315,322,431,686,264,442};
        
        int digit = evenDigitNum(arr);
        System.out.println("Here is the even digit num => "+ digit);
     }
}
