class Thread2 implements Runnable
{
public void run()
{
System.out.println("Thread is running.....");
}
public static void main(String args[])
{
Thread2 e=new Thread2();
Thread e1=new Thread(e);
e1.start();
}
}