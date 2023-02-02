//WAP to check a number is prime or not
import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int no,i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		no = sc.nextInt();
		for(i=2;i<no;i++)
		{
			if(no%i == 0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
}
		