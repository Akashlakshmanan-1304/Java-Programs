import java.util.*;
class EH4
{
public static void main(String args[])
{
int[] a=new int[20];
int n,i1,i2,n1,n2,q;
Scanner s=new Scanner(System.in);
try
{
System.out.println("Enter number of elements:");
n=s.nextInt();
try
{
System.out.println("Enter "+n+" Elements:");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("Enter index of two num:");
i1=s.nextInt();
i2=s.nextInt();
q=a[i1]/a[i2];
System.out.println("Quotient of "+a[i1]+" and "+a[i2]+" is:"+q);
}
catch(ArithmeticException e2)
{
System.out.println("Sorry!There are only "+n+" elements.");
}
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("Sorry! the element in the given index is not compatitable."); 
}
}
catch(InputMismatchException e3)
{
System.out.println("Please enter valid Input!");
}
finally
{
System.out.println("-----Thank You-----");
}
}
}

