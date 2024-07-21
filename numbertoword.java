import java.util.*;

public class numbertoword {
    public static void main(String[] args)
    { 
    int n,r,c=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a  number:");
    n=s.nextInt();
    System.out.println("Given Number:"+n);
    s.close();
    a[10]={"one","two","three","four","five","six","seven","eight","nine"};
    b[10]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigjteen","nineteen","twenty"};
    c[10]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    while(n>0)
    {
        r=n%10;
        d[10]+=r;
        c++;
        n=n/10;
    }
    for(int i=0;i<c;i++)
    System.out.println(d[i]+"\t");
}
}