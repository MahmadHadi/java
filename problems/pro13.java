import java.util.Scanner;
import java.util.Arrays;
class pro13
{
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int j[]=new int[5];
		System.out.println("Enter five prices:");
		for(int m=0;m<5;m++)
			j[m]=i.nextInt();
		Arrays.sort(j);
		System.out.println("Lowest price is:"+j[0]);
	}
}
