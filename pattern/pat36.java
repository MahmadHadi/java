class pat36
{
    public static void main(String[] args)
    {
        for(int i=1;i<5;i++)
        {
            for(int j=4;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int j=i-1;j>0;j--)
                System.out.print(j);
            System.out.println("");
        }
        for(int i=3;i>0;i--)
        {
            for(int j=4;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int j=i-1;j>0;j--)
                System.out.print(j);
            System.out.println("");
        }
    }
}
