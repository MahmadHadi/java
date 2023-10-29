class pat27
{
    public static void main(String[] args)
    {
        for(int i=1;i<12;i++)
        {
            if(i<7)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                System.out.print(i);
                for(int k=6;k>i;k--)
                    System.out.print(" ");
                for(int k=5;k>i;k--)
                    System.out.print(" ");
                if(i<6)
                    System.out.print(8-i);
            }
            else if(i<10)
            {
                for(int j=11;j>i;j--)
                    System.out.print(" ");
                System.out.print(i);
                for(int j=7;j<=i;j++)
                    System.out.print(" ");
                for(int j=8;j<=i;j++)
                    System.out.print(" ");
                System.out.print(i-4);
            }
            else
            {
                for(int j=11;j>i;j--)
                    System.out.print(" ");
                System.out.print(i-10);
                for(int j=7;j<=i;j++)
                    System.out.print(" ");
                for(int j=8;j<=i;j++)
                    System.out.print(" ");
                System.out.print(i-4);
            }
            System.out.println("");
        }
    }
}
