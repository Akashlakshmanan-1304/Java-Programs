import java.util.*;
public class longname
{
    public static void main(String[] args)
    {
        int n,i=0;
        String a[]=new String[100];
        String st,temp;
        st="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of name:"+"");
        n=s.nextInt();
        System.out.println("Enter "+n+" names:");
        for(i=0;i<n;i++)
        {
            a[i]=s.next();
        }
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(a[i].length()>a[j].length())
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
        }
        
        
    }
    System.out.println("Shortest name:"+a[0]);
    System.out.println("Longest name:"+a[n-1]);

    s.close();
    }

}