import java.util.Scanner;
class pro17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int temp=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
                if(n2%i==0)
                    if(n3%i==0)
                        temp=i;
        }
        System.out.print("Ingredient Quantities:"+(n1/temp)+" "+(n2/temp)+" "+(n3/temp));
    }
}
