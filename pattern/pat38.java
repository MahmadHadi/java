class pat38
{
    public static void main(String[] args)
    {
        for(int i=0;i<4;i++)
        {
            if(i==0)
                for(int j=0;j<6;j++)
                {
                    if(j!=0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            else
            {
                for(int j=3;j>i;j--)
                    System.out.print(" ");
                System.out.print("*");
                for(int j=0;j<i;j++)
                    System.out.print(" ");
                for(int j=1;j<i;j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=2;i>=0;i--)
        {
            if(i==0)
                for(int j=0;j<6;j++)
                {
                    if(j!=0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            else
            {
                for(int k=3;k>i;k--)
                    System.out.print(" ");
                System.out.print("*");
                for(int k=0;k<i;k++)
                    System.out.print(" ");
                for(int k=1;k<i;k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
// *****
//  * *
// *   *
//*     *
// *   *
//  * *
// *****
