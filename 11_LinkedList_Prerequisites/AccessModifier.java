class BankAccount{
     private double balance = 1000;

     public void deposit(int amount){
          balance += amount;
     }

     public double getBalance(){
          return balance;
     }
}
public class AccessModifier {
     public static void main(String[] args) {
          // creating instance of bank account
          BankAccount bnc = new BankAccount();
          bnc.deposit(500);

          double amount = bnc.getBalance();
          System.out.println("Total Balance -: "+amount);
          
     }
}
/*
 Notes => Access Modifier
 1. public => The member variable and methods are accessible any where in code base 
 eg -: main() method

 2. private => Accessible only within the same class , it contains some credential into
 eg -: password field

 3. protected => Member variable and methods are can only be accessible in same class and inherited class
 eg-: for inheritance

 4. default => Accessible in the same package throughout the codebase
 eg -: when no modifier is used
 */