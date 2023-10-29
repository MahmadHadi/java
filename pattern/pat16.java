class pat16
{
	public static void main(String[] args)
	{
        for(int i=5;i>1;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("X");
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");	
			}
			for(int k=3;k<=i;k++)
			{
				System.out.print(" ");
			}
			if(i>1)
				System.out.println("X");
			else
				System.out.println("");
		}
		for(int i=1;i<6;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("X");
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");	
			}
			for(int k=3;k<=i;k++)
			{
				System.out.print(" ");
			}
			if(i>1) System.out.println("X");
			else System.out.println("");
		}
	}
}
