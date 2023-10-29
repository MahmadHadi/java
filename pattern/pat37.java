class pat37
{
    public static void main(String[] args)
    {
        for(int i=0;i<6;i++)
        {
            if(i%2==0)
            {
               for(int j=1;j<i;j+=2)
                   System.out.print("* ");
                for(int j=6;j>i;j-- )
                    System.out.print("*");
                for(int j=5;j>i;j--)
                    System.out.print("*");
                for(int j=1;j<i;j+=2)
                    System.out.print(" *");
            }
            else
            {
                for(int j=6;j>i;j--)
                    System.out.print(" ");
                for(int j=0;j<i;j++)
                    System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<5;i++)
        {
            if(i%2==0)
            {
                for(int j=4;j>i;j-=2)
                    System.out.print("* ");
                for(int j=-1;j<=i;j++)
                    System.out.print("*");
                for(int j=0;j<=i;j++)
                    System.out.print("*");
                for(int j=4;j>i;j-=2)
                    System.out.print(" *");
            }
            else
            {
                for(int j=0;j<=i;j++)
                    System.out.print(" ");
                for(int j=5;j>=i;j-=2)
                    System.out.print("* ");
                for(int j=2;j>i;j-=2)
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
