class pat2
{
	public static void main(String[] a)
	{
		for(int i=5;i>0;i--)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");	
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}