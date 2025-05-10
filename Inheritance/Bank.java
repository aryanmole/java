import java.util.*;
class Account{
  int balance;
  
  Account(int b){
   balance=b;
  }
  
  void getinfo(){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter balance=");
   balance=sc.nextInt();
  }
  void display(){
    System.out.println("Current balance="+balance);
  }
  
  void deposit(){
    System.out.println("Money can be deposited");
  }
  void withdraw(){
    System.out.println("Money can be Withdrawed");
  }
}

class Savings extends Account{
int add;

 Savings(int b){
  super(b);
 }

  void addInterest(){
    add=balance+(balance/10);
    System.out.println("Interested balance="+add);
  }
}

class Bank{
 public static void main(String[] args){
   Savings s=new Savings(0);
 s.getinfo();
 s.display();
 s.addInterest();
 s.deposit();
 s.withdraw();
 }

}
