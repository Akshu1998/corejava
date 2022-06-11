import java.util.*;

class ArrAvg
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the values: ");
			arr[i]= sc.nextInt();
		}
		System.out.print("Values are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		float avg=0;
		for(int i=0;i<n;i++)
		{
			avg= avg + arr[i] / n;
		}
		System.out.println("Average of the numbers are = "+avg);
	}
}
