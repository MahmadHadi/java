import scava.util.Scanner;
class pro1
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Number:");
			i=sc.nextInt();
			if(i==42)
			{
				break;
			}
		}
	}
}
