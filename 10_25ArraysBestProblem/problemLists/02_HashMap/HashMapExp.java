import java.util.HashMap;

public class HashMapExp {
     public static void main(String[] args) {
          System.out.println("Exploring HashMap in java ");

          // 1. creating a HashMap 
          HashMap<String,Integer> marks = new HashMap<>();

          // 2. putting value in hash map
          marks.put("Govind", 99);
          marks.put("Emma", 95);
          marks.put("Raj", 85);

          // 3. Retrieving value from hashMap
          System.out.println("Here is the marks of Govind "+"=>"+marks.get("Govind"));

          // 4. updating hashmap data
          marks.put("Emma", 96);

          // 5. removing an entry
          marks.remove("Raj");

          // 6. Checking if key exist
          System.out.println("Contains Govind Data -: "+marks.containsKey("Govind"));

          // 7. iterating over hashmap entries
          for(String key : marks.keySet()){
               System.out.println(key+ " => "+ marks.get((key)));
          }
     }
}
/*
 1. A HashMap in Java is part of the Collection Framework, used to store data as key–value pairs.
 2. Each key is unique, but values can be duplicated.
 */