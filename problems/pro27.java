import java.util.Scanner;
class pro27
{
    static long ft(int nm)
    {
        if(nm==0)
            return 1;
        else
            return nm*ft(nm-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("Factorial of "+num+" is:"+ft(num));
    }
}
