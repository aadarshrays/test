package javabasics;

public class AccountTest {
public static void main(String[] args) {
Account a= new Account ();
a.setNumber("883265984178");                        
a.setAccounttype("saving Account");
a.setBalance(200000);
System.out.println(a.getNumber());
System.out.println(a.getAccounttype());
System.out.println(a.getBalance);
System.out.println();
a.deposite(500);
a.withdraw(700);
a.fundransfer(400);
a.paybill(800);
System.out.println();
System.out.println("Remainng balance..............");

}
}
