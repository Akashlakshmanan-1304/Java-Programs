import java.util.*;
interface Student 
{
public void getdata();
public void display();
}
class Studentt 
{

String name,name2,rno,grade;
int age,age2;
long phone;

public void getdata()
{
Scanner d=new Scanner(System.in);
System.out.println("----Enter Details Of Students----");
System.out.println("Enter name:");
name=d.nextLine();
System.out.println("Enter Roll Number:");
rno=d.nextLine();
System.out.println("Enter Grade Scored(O,A,B,C,F):");
grade=d.nextLine();
System.out.println("Enter Age:");
age=d.nextInt();
System.out.println("----Enter Parent Details----");
System.out.println("Enter Name:");
name2=d.nextLine();
name2=d.nextLine();
System.out.println("Enter Age:");
age2=d.nextInt();
System.out.println("Enter Phone Number:");
phone=d.nextLong();
}
}
class Display extends Studentt implements Student
{
public void display()
{
System.out.println("--Student Details--");
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Roll Number:"+rno);
System.out.println("Grade:"+grade);
System.out.println("Parent Name:"+name2);
System.out.println("Parent Age:"+age2);
System.out.println("Parent Contact:"+phone);
}
}
class Multiple
{
public static void main(String args[])
{
Display s=new Display();
s.getdata();
s.display();
}
}	


