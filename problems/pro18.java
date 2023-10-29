import java.util.Scanner;
class pro18
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		String str=Integer.toString(num);
		int nm=str.charAt(0);
		int m=str.charAt(str.length()-1);
		System.out.println("Sum of first and last digits is:"+(nm+m-96));
	}
}
