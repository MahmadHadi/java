class pat19
{
    public static void main(String[] args)
    {
        for(int i=5;i>0;i--)
        {
            if(i==5)
            {
                for(int j=0;j<6;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int k=0;k<=i;k++)
                {
                    if(k==0||k==i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
