class pat5
{
	public static void main(String[] a)
	{
		for(int i=1;i<6;i++)
		{
			if(i<5)
			{
				for(int j=5;j>i;j--)
				{
					System.out.print(" ");
				}
				System.out.print("*");

				for(int k=2;k<=i;k++)
				{
					System.out.print(" ");	
				}
				for(int l=3;l<=i;l++)
				{
					System.out.print(" ");
				}
				if(i>1)	System.out.println("*");
				else System.out.println("");
			}
			else System.out.println("* * * * *");
		}
	}
}
