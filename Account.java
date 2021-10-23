package javabasics;

public class Account {
private String number;
private String Accounttype;
private double Balance=0.00;
public int getBalance;
public String getNumber() {                                                                                                                                                                             
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAccounttype() {
	return Accounttype;
}
public void setAccounttype(String accounttype) {
	Accounttype = accounttype;
}
public double getBalance() {
	return Balance;
}
public void setBalance(int string) {
	Balance = string;
}
public void deposite (double d){
	Balance = Balance+d;
	System.out.println("Deposite +"+d);
}
public void withdraw (double w){
Balance = Balance-w;
System.out.println("withdraw-"+w);

}public void fundransfer (double f){
	Balance = Balance -f;
	System.out.println("funtransfer-"+f);
}
public void paybill (double p){
	Balance = Balance -p;
	System.out.println("paybill-"+p);
}
}
