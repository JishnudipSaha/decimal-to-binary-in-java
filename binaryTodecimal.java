import java.util.*;
class binaryTodecimal
{
    int toBinary(int a)
    {
        int p;
        int s;
        int x=a;
        int h=0;
        int y=0;
        while(a!=0)
        {
            p=a%10;
            s=(int)Math.pow(2,h);
            y=y+p*s;
            a=a/10;
            h++;
        }
        return y;
    }
    public static void main(String []args)
    {
        binaryTodecimal Math=new binaryTodecimal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number:-");
        int n=sc.nextInt();
        int show=Math.toBinary(n);
        System.out.println("The binary value is:-"+show);
    }
}