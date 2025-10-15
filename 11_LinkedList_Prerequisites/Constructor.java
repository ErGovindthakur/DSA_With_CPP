// Constructor => It's an special method that runs automatically when an object is created. It is mainly used to initialize member variables and constructor name must be same as class name

class Student{
     String name;
     int age;

     Student(String n, int a){
          name = n;
          age = a;
     }

     String studentInfo(){
          return name + " is " + age + " yrs old";
     }
}
public class Constructor {
     public static void main(String[] args) {
          Student s1 = new Student("Govind", 22);

          String myData = s1.studentInfo();

          System.out.println(myData);

          
     }
}
