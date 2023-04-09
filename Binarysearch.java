import java.util.Scanner;
class Binarysearch
{
	public static int binarysearch(int a[],int low,int high,int k)
	{
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(a[mid] == k)
			{
				return mid;
			}else if(a[mid] > k)
			{
				high = mid-1;
			}else 
			{
				low = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println(" enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println(" enter the elements : \n ");
		for(i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("  the elements : \n ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n enter the key : \n ");
		int key = sc.nextInt();
		int res = binarysearch(arr,0,size,key);
		if(res == -1)
		{
			System.out.println(" element not found \n ");
		}else 
		{
			System.out.printf(" element found at %d ",res);
		}
	}
}