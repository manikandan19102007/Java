import java.util.Scanner;
interface BankAccount
{
void Deposit();
void Withdraw();
void Statement();
void Register();
}
class Banking implements BankAccount
{
String AccName="",AccNo="";
int ib=5000,dp=0,wda=0;
Scanner sc=new Scanner(System.in);
public void Register()
{
System.out.print("Enter Holder Name:");
AccName=sc.next();
System.out.print("Enter Account Number:");
AccNo=sc.next();
System.out.println("Successful......");
}
public void Deposit()
{
System.out.print("Enter amount to Deposit:");
dp=sc.nextInt();
ib+=dp;
System.out.print("deposited Successfully");
}
public void Withdraw()
{
System.out.println("Enter amount to Withdraw:");
wda=sc.nextInt();
if(wda>ib)
{
throw new ArithmeticException("Insufficient balance");
}
ib-=wda;
System.out.println("Withdraw was successfull.");
}
public void Statement()
{
System.out.println("=================");
System.out.println("Account Holder Name:"+AccName);
System.out.println("Account Number:"+AccNo);
System.out.println("Account Balance:"+ib);
System.out.println("===============");
System.out.println("===============");
}
}
class ex6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Banking b=new Banking();
String choice;
do
{
try
{
System.out.println("===========");
System.out.println("1.Register");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Statement");
System.out.println("5.Exit");
choice=sc.next();
if(choice.equals("1")|| choice.equals("Register")|| choice.equals("register"))
{
b.Register();
}
else if(choice.equals("2")|| choice.equals("Deposit")|| choice.equals("deposit"))
{
b.Deposit();
}
else if(choice.equals("3")|| choice.equals("Withdraw")|| choice.equals("withdraw"))
{
b.Withdraw();
}
else if(choice.equals("4")|| choice.equals("Statement")|| choice.equals("statement"))
{
b.Statement();
}
else if(choice.equals("5")|| choice.equals("Exit")|| choice.equals("exit"))
{
System.out.println("Thank you...");
break;
}
}
catch(ArithmeticException e)
{
System.out.println("Error:"+e.getMessage());
System.out.println("Try again...");
}
}while(true);
}
}







