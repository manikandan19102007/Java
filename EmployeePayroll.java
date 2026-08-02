import java.util.Scanner;
class Employee
{
String empname,address,mailid,mobileno;
int id;
double basicpay,da,hra,pf,staffclub,netsalary,grosssalary;
Scanner sc=new Scanner(System.in);
void getDetails()
{
System.out.println("Enter Employee id:");
id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee Name:");
empname=sc.nextLine();
System.out.println("Enter Address:");
address=sc.nextLine();
System.out.println("Enter mail id:");
mailid=sc.nextLine();
System.out.println("Enter Mobile Number:");
mobileno=sc.nextLine();
System.out.println("Enter Basic Pay:");
basicpay=sc.nextDouble();
}
void display(String designation)
{
System.out.println("\n ------PAY SLIP------");
System.out.println("Designation:"+designation);
System.out.println("Employee ID:"+id);
System.out.println("Employee Name:"+empname);
System.out.println("Address:"+address);
System.out.println("Mail ID:"+mailid);
System.out.println("Mobile number:"+mobileno);
System.out.println("\nBasic Pay:"+basicpay);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff Club:"+staffclub);
System.out.println("---------------------");
System.out.println("Gross Salary:"+grosssalary);
System.out.println("Net Salary:"+netsalary);
}
}
class Programmer extends Employee
{
void calculateSalary()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
staffclub=basicpay*1/100;

grosssalary=basicpay+da+hra;
netsalary=grosssalary-pf-staffclub;
}
}
class AssistantProfessor extends Employee
{
void calculateSalary()
{
da=basicpay*110/100;
hra=basicpay*20/100;
pf=basicpay*12/100;
staffclub=basicpay*5/100;

grosssalary=basicpay+da+hra;
netsalary=grosssalary-pf-staffclub;
}
}
class AssociateProfessor extends Employee
{
void calculateSalary()
{
da=basicpay*130/100;
hra=basicpay*30/100;
pf=basicpay*12/100;
staffclub=basicpay*10/100;

grosssalary=basicpay+da+hra;
netsalary=grosssalary-pf-staffclub;
}
}
class Professor extends Employee
{
void calculateSalary()
{
da=basicpay*140/100;
hra=basicpay*40/100;
pf=basicpay*12/100;
staffclub=basicpay*15/100;

grosssalary=basicpay+da+hra;
netsalary=grosssalary-pf-staffclub;
}
}
public class EmployeePayroll
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Programmer");
System.out.println("2.Assistant Professor");
System.out.println("3.Associate Professor");
System.out.println("4.Professor");
System.out.println("Enter your choice:");
int choice=sc.nextInt();

switch(choice)
{
case 1:
Programmer p=new Programmer();
p.getDetails();
p.calculateSalary();
p.display("Programmer");
break;
case 2:
AssistantProfessor ap=new AssistantProfessor();
ap.getDetails();
ap.calculateSalary();
ap.display("Assistant Professor");
break;
case 3:
AssociateProfessor asp=new AssociateProfessor();
asp.getDetails();
asp.calculateSalary();
asp.display("Associate Professor");
break;
case 4:
Professor prof=new Professor();
prof.getDetails();
prof.calculateSalary();
prof.display("Assistant Professor");
break;
default:
System.out.println("Invalid Choice");
}
}
}
 
