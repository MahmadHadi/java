class pat34
{
    public static void main(String[] args)
    {
        String i="HADI";
        for(int j=0;j<5;j++)
        {
            for(int k=5;k>j;k--)
                System.out.print(" ");
            for(int k=j;k>=0;k--)
                System.out.print(i.charAt(k));
            for(int k=1;k<=j;k++)
                System.out.print(i.charAt(k));
            System.out.println("");
        }
    }
}
