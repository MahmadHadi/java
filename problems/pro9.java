class pro9
{
	public static void main(String[] args) {
		String str="RACECAR";
		int i=0;
		int j=0;
		while(i<str.length())
		{
			if(str.charAt(i)==str.charAt((str.length()-1)-i))
			{
				i++;
			}
			else
				j++;
		}
		if(j==0)
			System.out.println(str+" is Palindrome.");
	}
}
