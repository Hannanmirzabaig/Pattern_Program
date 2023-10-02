//not complete.

import java.util.Scanner;
class ButterFly1
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

		int x=1;   //left for half side vertically.
		int y=n;   //right half side vertically
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if (j<=x||j>=y)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}

	
			}
			if(i<n/2+1)
			{
				x++;
				y--;
			}
			else
			{
				x--;
				y++;
			}
		System.out.println();
		}
	}
}
		
			
	