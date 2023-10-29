class pro4
{
	public static void main(String[] args) {
		int i=125;
		int j=0;
		for(int k=1;k<i;k++)
		{
			if(i%k==0)
			{
				j++;
			}

		}
		System.out.println(i+" is divisible by "+j+" numbers.");
	}
}
