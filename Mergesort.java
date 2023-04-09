import java.util.*;
class Mergesort
{
	public static void merge(int a[],int low,int mid,int high)
	{
		int b[] = new int[a.length];
		int i,j,k;
		i=low;
		j=mid+1;
		k=low;
		while(i<=mid && j<=high)
		{
			if(a[i] < a[j])
			{
				b[k++] = a[i++];
			}else 
			{
				b[k++] = a[j++];
			}
		}
		while(i <= mid)
		{
			b[k++] = a[i++];
		}
		while(j <= high)
		{
			b[k++] = a[j++];
		}
		for(int z=low; z<=high; z++)
		{
			a[z] = b[z];
		}
	}
	public static void mergesort(int a[],int low,int high)
	{
		int mid;
		if(low < high)
		{
			mid = (low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
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
		mergesort(arr,0,arr.length-1);
		System.out.println("\n -- elements after sorting -- : ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}