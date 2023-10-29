class pro7
{
    public static void main(String[] args) {
    	String i="abcdefgh";
    	String j="aceg";
    	int l=0;
    	for(int m=0;m<i.length();m++)
    	{
    		for(int k=0;k<j.length();k++)
    		{
    			if(j.charAt(k)==i.charAt(m))
    				l++;
    		}
    	}
    	if(l==j.length())
    		System.out.println(j+" is subsequence of "+i);
    }
}
