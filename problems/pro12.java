import java.util.Scanner;
class pro12
{
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int j=i.nextInt();
		int k=i.nextInt();
		System.out.println("Addition is:"+(j+k));
		System.out.println("Subtraction is:"+(j-k));
		System.out.println("Multiplication is:"+(j*k));
		if(k!=0)
			System.out.println("Division is:"+(j/k));
		else
			System.out.println("Division is not possible.");
	}
}
