class Person{
     String name ;
}
public class MemoryUnderstanding {
     public static void main(String[] args) {
          
          int age = 21; // stored in stack
          System.out.println(age);
          Person p = new Person(); // managed and stored in heap

          p.name = "Govind"; // reference from stack to heap
          System.out.println(p.name);
     }
}

/*
 Memory Understanding
 => There are mainly two types memory areas in jva
 1. stack => It manages method calls and local variables

 2. heap => It manages object creation and reference types of data structure (arrays, collection frameworks)
 */