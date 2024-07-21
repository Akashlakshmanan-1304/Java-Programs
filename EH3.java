import java.util.*;
class EH3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1;
char c;
int n;
try
{
System.out.println("Enter a string:");
s1=s.nextLine();
System.out.println("String:"+s1);
try
{
System.out.println("Enter Letter Index To Display:");
n=s.nextInt();
c=s1.charAt(n);
System.out.println("Sliced Char:"+c);
}
catch(InputMismatchException a2)
{
System.out.println("Please Enter a String Value!");
}
}
catch(StringIndexOutOfBoundsException a)
{
System.out.println("Sorry! Wrong value");
}
finally
{
System.out.println("-----Thank You-----");
}
}
}
