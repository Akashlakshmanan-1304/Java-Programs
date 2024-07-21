import java.util.*;
class Pattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,i=0,j=0;
System.out.println("Enter number of rows:");
n=s.nextInt();
System.out.println("----Pattern----");
for(i=0;i<n;i++)
{
for(j=n-i;j>1;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}