import java.util.*;

class Stringascending
{
public static void main(String args[])
{
Ascending a=new Ascending();
a.get();
}
}
class Ascending
{
int n,i,j;
String temp;
String a[]=new String[100];
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("Enter number of strings to enter:");
n=s.nextInt();
System.out.println("Enter "+n+" Strings:");
for(i=0;i<=n;i++)
{
a[i]=s.nextLine();
}
System.out.println("Given Strings:");
for(i=0;i<=n;i++)
{
System.out.println(a[i]);
}
System.out.println("String Ascending:");
for(i=0;i<=n;i++)
{
for(j=i+1;j<=n;j++)
{
if(a[i].compareTo(a[j])>0)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<=n;i++)
{
System.out.println(a[i]);
}
}
}