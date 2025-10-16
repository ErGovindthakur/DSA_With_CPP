class MyData{
     // private String name;
     // private int age;

     // void setData(String n,int a){
     //      // this.name refers to outer name (which is private) , isn't it ?
     //       this.name = n;
     //       this.age = a;
     // }

     String brand;
     double price;
     MyData(String brn, double prc){
          this.brand = brn;
          this.price = prc;
     }
     void displayData(){
          System.out.println(brand+" is for  "+price+"Rs");
     }
}
public class Practice {
     public static void main(String[] args) {
          // MyData md = new MyData();
          // md.setData("Govind", 21);
          // md.displayData();
          MyData md1 = new MyData("Tesla", 7000000);
          md1.displayData(); // first time giving diff data

          MyData md2 = md1;
          md2.brand = "Range-Rover";
          md2.price = 12000000;

          md1.displayData(); // second time giving data also

     }
}
