import java.util.HashSet;

class IsDuplicateValue{
     boolean checkDuplicateOptimal(int []arr){

          HashSet<Integer> hashElem = new HashSet<>();

          // applying loop over array
          for(int i = 0; i<arr.length; i++){
               if(hashElem.contains(arr[i])){
                    return true;
               }
               hashElem.add(arr[i]);
          }
          return false;
     }
}
public class ContainsDuplicate {
     public static void main(String[] args) {
          int [] dupElem = {1,9,2,3,5,2};

          IsDuplicateValue dup = new IsDuplicateValue();

          boolean isDup = dup.checkDuplicateOptimal(dupElem);

          System.out.println("Duplicate elem is available -> "+isDup);
     }
}
