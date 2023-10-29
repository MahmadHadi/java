class pat26
{
    public static void main(String[] args)
    {
        int i=1;
        while(i<2)
        {
        for(int j=1;j<6;j++)
        {
            for(int k=6;k>j;k--)
                System.out.print(" ");
            i=j-1;
            for(int l=1;l<=j;l++)
            {
                i++;
                System.out.print(i);
                
            }
            
            for(int m=2;m<=j;m++)
            {
                i-=1;
                System.out.print(i);
            }
            System.out.println("");
        }
        }
    }
}
