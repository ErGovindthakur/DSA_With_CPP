class AvgMarks {
     int[] marks = { 81, 98, 82, 99, 100 };

     // creating a method which will return avg mark
     double calculateAvgMark() {
          int totalMarks = 0;

          for (int mark : marks) {
               totalMarks += mark;
          }
          ;

          double avgMark = (double) totalMarks / marks.length;

          return avgMark;
     }
}

public class BasicArr {
     public static void main(String[] args) {
          System.out.println("Array Exploration -: ");

          // creating an integer type arr
          int[] marks = { 81, 98, 82, 99, 100 };
          System.out.println("Single Marks -> " + marks[0]);

          System.out.println("All Marks");
          // learn how to traverse array
          for (int i = 0; i < marks.length; i++) {
               System.out.println("Mark -> " + (i + 1) + " -> " + marks[i]);
          }

          // 2. Creating an string array
          String[] days = { "Sun", "Mon", "Tue", "Wed", "Thru", "Fri", "Sat" };
          System.out.println("Today is " + days[0] + "day");

          // 3. creating a double data type array
          // this is called array declaration
          double[] years = new double[3];
          years[0] = 2023;
          years[1] = 2024;
          years[2] = 2025;
          System.out.println("It's " + (int) years[2]);

          // 4. creating float type array
          // this is called definition of array (declaration + initialization)

          float[] flt = { 1.2f, 3.2f, 5.4f };
          System.out.println(flt[0]);

          // 5. creating a multidimensional array and apply traversal

          int[][] table = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
          // accessing single point
          System.out.println("multi dimensional array length -: " + table[0].length);
          System.out.println("multi dimensional array elem -: " + table[0][1]);
          // traversing whole array

          for (int i = 0; i < table.length; i++) { // traverse rows
               for (int j = 0; j < table[i].length; j++) {
                    System.out.print(table[i][j] + " ");
               }
               System.out.println();

          }

          AvgMarks avg = new AvgMarks();
          double result = avg.calculateAvgMark();
          System.out.println("Average Mark -> " + result);
     }
}