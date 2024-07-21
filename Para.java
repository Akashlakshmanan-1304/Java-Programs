import java.util.*;
class Show
{
String s1,s2=" ",s3=" ",s5=" ";
String s4[]=new String[300];
Scanner s=new Scanner(System.in);
public void get()
{
int l=1;
int length=0,i;
System.out.println("Enter a line:");
s1=s.nextLine();
s1=s1+" ";
for(i=0;i<s1.length();i++)
{
if(s1.charAt(i)!=' ')
s3+=s1.charAt(i);
else
{
s4[length]=s3;
length++;
l++;
s3=" ";
}
}
System.out.println("---Words in Paragraph---");
for(i=0;i<length;i++)
{
System.out.println(s4[i]);
}
s2=s4[0];
s5=s4[0];
for(i=0;i<length;i++)
{
if(s2.length()<s4[i].length())
s2=s4[i];
if(s5.length()>s4[i].length())
s5=s4[i];
}
System.out.println("Largest Word:"+s2);
System.out.println("Smallest Word:"+s5);
}
}
class Para
{
public static void main(String args[])
{
Show o=new Show();
o.get();
}
}