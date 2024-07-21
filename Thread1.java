class Thread1
{
public static void main(String args[])
{
extending e=new extending();
extending2 e2=new extending2();
extending3 e3=new extending3();
e.start();
e2.start();
e3.start();

 for(int i=1500;i<2000;)
System.out.println(i);
}
}
class extending extends Thread
{
public void run()
{
    for(int i=1;i<500;i++)

System.out.println(i);
}
}
class extending2 extends Thread
{
public void run()
{
    for(int i=500;i<1000;i++)
System.out.println(i);
}
}
class extending3 extends Thread
{
public void run()
{
    for(int i=1000;i<1500;i++)
System.out.println(i);
}
}
//Random Num

