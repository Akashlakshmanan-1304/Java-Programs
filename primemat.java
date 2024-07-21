import java.util.*;
class primemat
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r,c,i,j,k,co=0;
int a[][]=new int[20][20];
System.out.println("Enter number of rows:");
r=s.nextInt();
System.out.println("Enter number of columns:");
c=s.nextInt();
System.out.println("Enter "+r*c+" elements:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Given matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("After Process:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
co=0;
if(a[i][j]==1||a[i][j]==2)
co=0;
else
{
for(k=2;k<a[i][j];k++)
{
if(a[i][j]%k==0)
co++;
}
}
if(co==0)
System.out.print(a[i][j]+"\t");
else
System.out.print("-\t");
}
System.out.println();
}
}
}