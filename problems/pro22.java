import java.util.Scanner;
import java.util.Arrays;
class pro22
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i[]= new int[5];
		System.out.println("Enter the elements:");
		for(int j=0;j<i.length;j++)
			i[j]=sc.nextInt();
		Arrays.sort(i);
		System.out.println("The maximum element is:"+i[i.length-1]);
	}
}
