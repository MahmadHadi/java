class pro8
{
	static long factorial(long i)
	{
		if(i==0)
			return 1;
		else
			return i*factorial(i-1);
	}
	public static void main(String[] args) {
		long j=10;
		System.out.println("Factorial of "+j+" is: "+factorial(j));
	}
}
