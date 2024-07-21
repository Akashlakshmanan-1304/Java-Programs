import java.util.*;
interface Data 
{
public void getdata();
public void calc();
public void display();
}
class Employee 
{

String name,eno;
int age,hra,da,ma,bs,loan,lic,gs,red,ns;
long phone;

public void getdata()
{
Scanner d=new Scanner(System.in);
System.out.println("----Enter Details Of Employee----");
System.out.println("Enter name:");
name=d.nextLine();
System.out.println("Enter Employee Number:");
eno=d.nextLine();
System.out.println("Enter Age:");
age=d.nextInt();
System.out.println("Enter Basic Salary:");
bs=d.nextInt();
System.out.println("Enter House rent allowance:");
hra=d.nextInt();
System.out.println("Enter Dearness Allowance:");
da=d.nextInt();
System.out.println("Enter Medical Allowance:");
ma=d.nextInt();
System.out.println("Enter Loan Amount:");
loan=d.nextInt();
System.out.println("Enter LIC Amount:");
lic=d.nextInt();
System.out.println("Enter Phone Number:");
phone=d.nextLong();
}
public void calc()
{
gs=bs+hra+da+ma;
red=loan+lic;
ns=gs-red;
}
}
class Display extends Employee implements Data
{
public void display()
{
System.out.println("--Employee Details--");
System.out.println("Employee Name:\t"+name);
System.out.println("Employee Age:\t"+age);
System.out.println("Employee Number:"+eno);
System.out.println("Gross Salary:\t"+gs);
System.out.println("Reduction:\t"+red);
System.out.println("Net Salary:\t"+ns);
System.out.println("Parent Contact:"+phone);
}
}
class Interface
{
public static void main(String args[])
{
Display s=new Display();
s.getdata();
s.calc();
s.display();
}
}	


