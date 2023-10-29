class pat30
{
    public static void main(String[] args)
    {
        for(int i=0;i<9;i++)
        {
            if(i<5)
            {
                for(int j=4;j>i;j--)
                    System.out.print(" ");
                for(int j=0;j<=i;j++)
                    System.out.print("*");
                for(int j=0;j<i;j++)
                    System.out.print("*");
            }
            else
            {
                for(int j=4;j<i;j++)
                    System.out.print(" ");
                for(int j=8;j>=i;j--)
                    System.out.print("*");
                for(int j=8;j>i;j--)
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
