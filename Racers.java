import java.util.Scanner;
class Racers
{
	public static void main(String  arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the speed of racer1 : ");
		float r1 = sc.nextFloat();
		System.out.println(" enter the speed of racer2 : ");
		float r2 = sc.nextFloat();
		System.out.println(" enter the speed of racer3 : ");
		float r3 = sc.nextFloat();
		System.out.println(" enter the speed of racer4 : ");
		float r4 = sc.nextFloat();
		System.out.println(" enter the speed of racer5  : ");
		float r5 = sc.nextFloat();
		float avg = (r1+r2+r3+r4+r5)/5;
		System.out.printf(" average speed : %.2f \n",avg);
		if(r1 > avg)
		{
			System.out.printf(" racer1 is qualified with a speed of %.2f \n",r1);
		}
		if(r2 > avg)
		{
			System.out.printf(" racer2 is qualified with a speed of %.2f \n",r2);
		}
		if(r3 > avg)
		{
			System.out.printf(" racer3 is qualified with a speed of %.2f \n",r3);
		}
		if(r4 > avg)
		{
			System.out.printf(" racer4 is qualified with a speed of %.2f \n",r4);
		}
		if(r5 > avg)
		{
			System.out.printf(" racer5 is qualified with a speed of %.2f \n",r5);
		}

	}
} 