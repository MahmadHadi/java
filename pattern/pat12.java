class pat12
{
    public static void main(String[] args)
    {
        int num1=1;
        while(num1<2)
        {
            for(int i=1;i<6;i++)
            {
                for(int k=6;k>i;k--) System.out.print(" ");
                num1=i-1;
                for(int u=1;u<=i;u++)
                {
                    num1++;
                    System.out.print(num1);

                }

                for(int j=2;j<=i;j++)
                {
                    num1-=1;
                    System.out.print(num1);
                }
                System.out.println("");
            }
        }
    }
}
