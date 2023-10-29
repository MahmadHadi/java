import java.util.Scanner;
class pro19
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        String str=Integer.toString(num);
        int tp=0;
        for(int i=0;i<str.length();i++)
            tp+=str.charAt(i);
        System.out.println("Sum of all digits:"+(tp-(str.length()*48)));
    }
}
