import java.io.IOException;
class Throww
{
void m()throws IOException
{
throw new IOException("Device error");
}
void n()throws IOException
{
m();
}
void p()
{
try
{
n();
}
catch(Exception e)
{
System.out.println("Exception Handling");
}
}
public static void main(String args[])
{
Throww o=new Throww();
o.p();
System.out.println("Normal flow");
}
}