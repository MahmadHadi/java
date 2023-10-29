import java.util.Scanner;
class pro24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
            System.out.println("Difference between two numbers:"+(num1-num2));
        else
            System.out.println("Difference between two numbers:"+(num2-num1));
    }
}
