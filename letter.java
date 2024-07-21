import java.util.*;
class letter
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,i,r,sum=0;
System.out.println("Enter num:");
n=s.nextInt();
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
int c=0;
while(sum>0)
{
c=sum%10;
if(c==1)
System.out.print("One\t"); 
else if(c==2)
System.out.print("Two\t"); 
else if(c==3)
System.out.print("Three\t"); 
else if(c==4)
System.out.print("Four\t"); 
else if(c==5)
System.out.print("Five\t"); 
else if(c==6)
System.out.print("Six\t"); 
else if(c==7)
System.out.print("Seven\t"); 
else if(c==8)
System.out.print("Eight\t"); 
else if(c==9)
System.out.print("Nine\t"); 
sum=sum/10;
}
}
}