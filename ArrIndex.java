import java.util.*;

class ArrIndex
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the value: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number whose index you want to see: ");
		int m=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if( m==arr[i] )
				System.out.println("Index for "+m+" "+"is = "+i);
		}
	}
}
