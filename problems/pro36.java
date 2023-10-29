import java.util.Scanner;
class pro36
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=0;
        for(int i=1;i<num;i++)
        {
            for(int j=2;j<i;j++)
                if(i%j==0)
                    temp++;
        }
        if(temp==0)
            System.out.println(num+" is prime number.");
        else
            System.out.println(num+" isn't prime number.");
    }
}
