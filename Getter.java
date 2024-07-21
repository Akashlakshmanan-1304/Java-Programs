import java.util.*;
class Getter
{
public static void main(String[] args)
{
Get a=new Get();
a.setname("Akash");
System.out.println(a.getname());
}
}
class Get
{
private String name;
public String getname()
{
return name;
}
public void setname(String n)
{
this.name=n;
}
}
