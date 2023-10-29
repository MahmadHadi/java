class pro14
{
	public static void main(String[] args) {
		int i[]={4,5,3,6,2,7};
		int j=0;
		int k=0;
		while((j+k)<i.length)
		{
			if(i[j+k]%2==0)
				j++;
			else
				k++;
		}
		if(j>k)
			System.out.println("Majority is even.");
		else if(k>j)
			System.out.println("Majority is odd.");
		else
			System.out.println("Both are equale.");
	}
}
