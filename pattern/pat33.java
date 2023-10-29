class pat33
{
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--)
                System.out.print(" ");
            if(i==0 || i==4)
                for(int k=0;k<5;k++)
                    System.out.print("*");
            else
            {
                for(int l=0;l<4;l++)
                {
                    if(l==0||l==3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
