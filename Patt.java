import java.util.*;
class Patte
{
String s1,s2="",s3="",s21="",s31;
int i=0,j=0;
int[] n=new int[20];
String[] a=new String[100];
Scanner s = new Scanner(System.in);
void pattt()
{
System.out.println("Enter Value:");
s1=s.nextLine();
for(i=0;i<s1.length();i++)
{
if(Character.isDigit(s1.charAt(i)))
{
s21+=s1.charAt(i);
if(s21!=null)
a[i++]=s21;
}
for(int k=0;k<i;k++)
{
s31="";
if(a[k]!=null)
{
s31=a[k];
if(s31!=null)
n[j]=Integer.valueOf(s31);
j++;
}
}
}
for(int l=0;l<j;l++)
System.out.println("N:"+n[l]);
}
}
class Patt
{
public static void main(String args[])
{
Patte p=new Patte();
p.pattt();
}
}
