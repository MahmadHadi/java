class pat14
{
	public static void main(String[] args) {
		for(int i=5;i>0;i--)
		{
			if(i==5 || i==1) System.out.println("ZZZZZ");
			else
			{
				for(int j=0;j<(i-1);j++)
				{
					System.out.print(" ");
				}
				System.out.println("Z");
			}
		}
	}
}