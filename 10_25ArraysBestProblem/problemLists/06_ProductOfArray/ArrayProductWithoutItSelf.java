class FindProduct {

     int[] Product(int[] arr) {

          int[] result = new int[arr.length];
          for (int i = 0; i < arr.length; i++) {
               int product = 1;
               for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                         product *= arr[j];
                    }
               }
               result[i] = product;
          }
          return result;
     }
}

public class ArrayProductWithoutItSelf {
     public static void main(String[] args) {
          System.out.println("Solving product of An array element except itself -: ");

          /*
           * given -: arr = [1,2,3,4,5];
           * result = [arr.length];
           * solution =>
           * step -> 1 (exclude arr[0] = 1)
           * product => 2 * 3 * 4 * 5 => 120
           * result.push(product)
           * step -> 2 (exclude arr[1] = 2)
           * product => 1 * 3 * 4 * 5 => 60
           * result.push(product)
           * step -> 3 (exclude arr[2] = 3)
           * product => 1 * 2 * 4 * 5 => 40
           * result.push(product)
           * step -> 4 (exclude arr[3] = 4)
           * product => 1 * 2 * 3 * 5 => 30
           * result.push(product)
           * step -> 5 (exclude arr[4] = 5)
           * product => 1 * 2 * 3 * 4 => 24
           * result.push(product)
           * 
           * output => result = [120,60,40,30,24]
           */
          int[] arr = { 1, 2, 3, 4, 5 };
          FindProduct fnd = new FindProduct();

          int[] result = fnd.Product(arr);
          for(int i = 0; i<result.length; i++){
               System.out.print(result[i]+",");
          }

     }
}