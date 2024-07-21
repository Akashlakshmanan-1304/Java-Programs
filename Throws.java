import java.util.*;
class Throws
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int age;
System.out.println("Enter age:");
age=s.nextInt();
Throwing t= new Throwing();
t.throwi(age);
}
}
class Throwing
{
public void throwi(int age)
{
if((age<18)&&(age>50))
System.out.println("Sorry! you are not eligible");
else
System.out.println("Eligible");
}
}
