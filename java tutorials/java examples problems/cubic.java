import java.util.Scanner;
class Array_Cubic
{
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.println("\nCubic Array Elements...\n");
		for(int e:a)
		{
			System.out.println(e*e*e);
		}
    }
}