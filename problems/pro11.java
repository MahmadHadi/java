import java.util.Scanner;
import java.util.Arrays;
class pro11
{
	public static void main(String[] args) {
		int i[]=new int[5];
		Scanner j=new Scanner(System.in);
		System.out.println("Enter five numbers for Array:");
		for(int k=0;k<5;k++)
		{
			i[k]=j.nextInt();
		}
		Arrays.sort(i);
		System.out.print("Sum of two smallest numbers is:"+(i[0]+i[1]));
	}
}
