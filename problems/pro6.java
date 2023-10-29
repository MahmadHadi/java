class pro6
{
	public static void main(String[] args) {
		int i=123;
		String j=Integer.toString(i);
		String k=new StringBuilder(j).reverse().toString();
		int l=Integer.parseInt(k);
		System.out.println("Original number is:"+i);
		System.out.println("Reverse number is:"+l);
	}
}
