// Note.1 => class is named group of feature and functionality, it can be also called blueprint of any real stuff that defines what the field (obj) can contain and what it can do (function)

// Note.2 => Object are the real world entities, or instance to class, that rules are predefine in class already


// creating first class
class Car{
     String brandName;
     int speed;

     void drive(){
          System.out.println("Driving "+brandName+ "at speed "+speed+"km/h");
     }
}
public class ClassAndObject {
     public static void main(String[] args) {
          Car car1 = new Car();
          car1.brandName = "Range-Rover";
          car1.speed = 81;
          car1.drive();
     }
}
