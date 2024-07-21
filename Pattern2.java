import java.util.*;
class Patt
{
String s1,s2="",s3="",s4="";
String[] a=new String[20];
int i,n,j=0;
Scanner s = new Scanner(System.in);
void pattt()
{
System.out.println("Enter Value:");
s1=s.nextLine();
for(i=0;i<s1.length();i++)
{
if(Character.isAlphabetic(s1.charAt(i)))
s3=s3+s1.charAt(i);
else if(Character.isDigit(s1.charAt(i))&&(s1.charAt(i)!=' '))
{
s2+=s1.charAt(i);
n=Integer.valueOf(s2);
for(j=0;j<n;j++)
s4+=s3;
s3="";
}
s2="";
}
System.out.println("Ans:"+s4);
}
}
class Pattern2
{
public static void main(String args[])
{
Patt p=new Patt();
p.pattt();
}
}
