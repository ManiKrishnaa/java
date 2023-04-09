import java.util.*;
class Bubblesort
{
	public static void bubblesort(int a[],int n)
	{
		int i,j,temp;
		for(i=0; i<n; i++)
		{
			for(j=0; j<n-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println(" enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println(" enter the elements : ");
		for(i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(" -- elements before sorting -- : ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		bubblesort(arr,size);
		System.out.println("\n -- elements after sorting -- : ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}