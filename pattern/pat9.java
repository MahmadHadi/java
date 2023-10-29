class pat9
{
	static long fectorial(long i)
	{
		if(i==0) return 1;
		else return i*fectorial(i-1);
	}
	static long fec(long j,long k)
	{
		long r=fectorial(k)/(fectorial(j)*fectorial(k-j));//
		return r;
	}
	public static void main(String[] args)
	{
		for(int t=0;t<5;t++)
		{
			for(int l=0;l<=t;l++) System.out.print(fec(l,t));
				
			System.out.println("");
		}
	}
}