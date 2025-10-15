// References are such type of variables which holds memory address, instead of actual data
class Box{
     int volume;
}
public class References {
     public static void main(String[] args) {
          // creating instance ot Box class
          Box b1 = new Box();

          b1.volume = 50;

          System.out.println("Volume of b1 before b2 reference -> "+b1.volume);

          Box b2 = b1; // here b1 and b2 both points to same object
          
          b2.volume = 100;
          System.out.println("Volume of b1 after b2 reference  -> "+b1.volume);

          
     }
}
