import java.util.Scanner;
import java.lang.Math;
class Quadraticeq
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a : ");
		double a = sc.nextDouble();
		System.out.println(" enter b : ");
		double b = sc.nextDouble();
		System.out.println(" enter c : ");
		double c = sc.nextDouble();
		double det = (b*b)-(4*a*c);
		if(det > 0.0)
		{
			System.out.println(" \n -- roots are real and different -- \n ");
			double root1 = (-b + Math.sqrt(det)) / (2*a);
			double root2 = (-b - Math.sqrt(det)) / (2*a);
			System.out.printf(" root1 : %.2f",root1);
			System.out.printf("\n root2 : %.2f",root2);
		}else if(det == 0.0)
		{
			System.out.println(" \n -- roots are real and equal -- \n ");
			double root = (-b)/(2*a);
			System.out.printf(" root : %.2f",root);
		}else 
		{
			System.out.println(" \n -- roots are complex  and different -- \n ");
			double root1 = (-b)/(2*a);
			double img1 = Math.sqrt(-(det));
			double root2 = (-b)/(2*a);
			double img2 = Math.sqrt(-(det));
			System.out.printf(" root1 : %.2f",root1);
			System.out.printf(" + i %.2f",img1/(2*a));
			System.out.println("\n");
			System.out.printf(" root2 : %.2f",root2);
			System.out.printf(" - i %.2f",img2/(2*a));
		}
	}
}