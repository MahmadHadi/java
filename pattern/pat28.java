class pat28
{
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {if(i<5){
            for(int j=6;j>i;j--)
                System.out.print(" ");
            System.out.print("1");
            for(int j=1;j<i;j++)
                System.out.print(" ");
            for(int j=1;j<i;j++)
            {
                if(j<(i-1))
                    System.out.print(" ");
                else
                    System.out.print(i);
            }
            }
            else
            {
                for(int j=6;j>i;j--)
                    System.out.print(" ");
                for(int j=1;j<10;j++)
                    System.out.print(j);
            }
            System.out.println("");
        }
    }
}
