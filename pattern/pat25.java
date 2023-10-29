class pat25
{
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {
            for(int j=6;j>i;j--)
                System.out.print(" ");
            for(int j=i;j>0;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }
        for(int i=4;i>0;i--)
        {
            for(int j=5;j>=i;j--)
                System.out.print(" ");
            for(int j=i;j>0;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
