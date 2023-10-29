class pat13
{
	public static void main(String[] args)
	{
		int num=1;

		while(num<2)
		{
			for(int i=1;i<6;i++)
			{
        	    for(int j=6;j>i;j--) System.out.print(" ");
				if(i!=4)
				{
					System.out.print("A");
					num=i;
					for(int k=2;k<=i;k++)
					{
						num++;
						System.out.print(" ");	
					}
					for(int l=3;l<=i;l++)
					{
						num-=1;
						System.out.print(" ");
					}
					if(i>1)	System.out.println("A");
					else System.out.println("");
				}
				else System.out.println("AAAAAAA");
			}
		}
	}
}
