public class Thread6
{
public static void main(String args[])
{
int n=8,i;
for(i=0;i<n;i++)
{
Thread m=new Thread(new multi());
m.start();
}
}
}
class multi implements Runnable
{
public void run()
{
try
{
System.out.println("Thread "+Thread.currentThread().getId()+" is running");
}
catch(Exception e)
{
System.out.println("Error caught");
}
}
}
