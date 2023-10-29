import java.util.*;
class pro
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        while(true)
        {
            System.out.print("Enter the number:");
            int num=sc.nextInt();
            temp++;
            if(num==42) break;
        }
        System.out.print("Total entries:"+temp);
    }
}
