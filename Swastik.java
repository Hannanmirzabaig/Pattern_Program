import java.util.Scanner;
class Swastik
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		pattern(n);

	}

	public static void pattern(int n)
	{
		char x='A';
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==n/2+1||j==n/2+1 || j>=n/2+1&&i==1|| j<=n/2+1&&i==n || i<=n/2+1&&j==1 || i>=n/2+1&&j==n)		
				{
				System.out.print("* ");
				x++;
				}
				else
				System.out.print("  ");  // same same space upper and lower side.
			}
			System.out.println();
		}
	}
}