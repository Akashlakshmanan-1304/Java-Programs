public class Thread4 implements Runnable
{
public void run()
{
System.out.println("Running.....");
}
public static void main(String args[])
{
Runnable r=new Thread4();
Thread t=new Thread(r,"New Thread");
t.start();
String str=t.getName();
System.out.println(str);
}
}