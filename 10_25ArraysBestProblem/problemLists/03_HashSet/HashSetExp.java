import java.util.HashSet;

public class HashSetExp {
   public static void main(String[] args) {
     // 1. creating a hashSet
     HashSet<String> emails = new HashSet<>();

     // 2. putting value in hashSet
     emails.add("john@gmail.com");
     emails.add("emma@gmail.com");
     emails.add("govind@gmail.com");
     emails.add("emma@gmail.com");
     emails.add("rima@gmail.com");

     // 3. accessing hashSet data
     System.out.println("All Emails are here -: "+emails);

     // 4. checking existence
     System.out.println("Email is available =>"+emails.contains("emma@gmail.com"));

     // 5. removing value from hashSet
     emails.remove("rima@gmail.com");

     // 6. iterate through hashSet elem
     for(String email : emails){
          System.out.println(email);
     }

   }  
}
