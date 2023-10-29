import java.util.Scanner;
class pro20
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        String str=Integer.toString(num1);
        String str2=Integer.toString(num2);
        int tp1=0;
        int tp2=0;
        for(int i=0;i<str.length();i++)
            tp1+=str.charAt(i);
        for(int i=0;i<str2.length();i++)
            tp2+=str2.charAt(i);
        System.out.println("Sum of all digits:"+((tp1+tp2)-((str.length()+str2.length())*48)));
    }
}
