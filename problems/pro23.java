import java.util.Scanner;
class pro23
{
	static long fact(int num)
	{
		if(num==0)
			return 1;
		else
			return num*fact(num-1);
	}
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
		String str=sc.nextLine();
        int strL=str.length();
        System.out.println("Number of substrings is:"+fact(strL));
	}
}
