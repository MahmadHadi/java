import java.util.Scanner;
class pro26
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Addition:"+(n1+n2));
        System.out.println("Subtraction:"+(n1-n2));
        System.out.println("Multiplication:"+(n1*n2));
        System.out.println("Modulus:"+(n1%n2));
        if(n2!=0)
            System.out.println("division:"+(n1/n2));
    }
}
