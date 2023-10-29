import java.util.Scanner;
class pro21
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		String str=Integer.toString(num);
		int tp1=0;
		int tp2=0;
		while(tp1<str.length() && tp2==0)
		{
			if(str.charAt(tp1)==str.charAt(str.length()-1-tp1))
				tp1++;
			else
				tp2++;
		}
		if(tp2==0)
			System.out.println(num+" is palindrome.");
		else
			System.out.println(num+" isn't palindrome.");
	}
}
