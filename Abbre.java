import java.util.*;
class Abb
{
Scanner s=new Scanner(System.in);
String s1;
String s2=" ",s3=" ";
int i,j=0,length;
void get()
{
System.out.println("Enter A String :");
s1=s.nextLine();
s1=" "+s1;
j=s1.length();
for(i=0;i<j;i++)
{
if(s1.charAt(i)==' ')
{
s2+=s1.charAt(i+1);
}
s3=s2;
}
System.out.println("Abbreviation:"+s3.toUpperCase());
}
}
class Abbre
{
public static void main(String args[])
{
Abb a=new Abb();
a.get();
}
}