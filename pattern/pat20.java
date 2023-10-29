class pat20
{
    public static void main(String[] args)
    {
        for(int i=5;i>0;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                if(k==0)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            for(int l=1;l<i;l++)
            {
                if(l!=i-1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }
    }
}
