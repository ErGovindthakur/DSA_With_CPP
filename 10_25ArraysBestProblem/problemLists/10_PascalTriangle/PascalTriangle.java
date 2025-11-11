import java.util.*;

public class PascalTriangle {

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: no rows
        if (numRows <= 0) return triangle;

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // First and last elements are always 1
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements are sum of the two elements above
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int n = 5; // number of rows
        List<List<Integer>> result = generate(n);

        // Print the triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

