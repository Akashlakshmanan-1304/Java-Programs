import java.util.*;
class EH1
{
public static void main(String args[])
{
int n1,n2,q;
Scanner s= new Scanner(System.in);
try
{
System.out.println("Enter two numbers:");
n1=s.nextInt();
n2=s.nextInt();
q=n1/n2;
System.out.println("Quotient:"+q);
}
catch(ArithmeticException a)
{
System.out.println("Sorry!You have entered wrong input");
}
}
}