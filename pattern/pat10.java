class pat10
{
	public static void main(String[] args)
	{
		int temp=1;
		while(temp<=10)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(temp);
					temp++;
				}
				System.out.println("");
			}
		}
	}
}