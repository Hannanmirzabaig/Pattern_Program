
import java.util.Scanner;
class Pyramid
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		checkTriangle(n);
	}
	
	public static void checkTriangle(int n)
	{

		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
		space--;
		star+=2;
		System.out.println();
		}
	}
}