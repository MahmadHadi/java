class pro16
{
	public static void main(String[] args) {
		int i=1444244;
		String j=Integer.toString(i);
		String k="4";
		int m=0;
		for(int n=0;n<j.length();n++)
		{
			if(j.charAt(n)==k.charAt(0))
				m++;
		}
		System.out.println(i+" has occurrences of digit "+k+" is:"+m);
	}
}
