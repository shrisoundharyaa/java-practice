import java.util.Scanner;
class ArrayNum_Negative
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
		System.out.println("\nNegative Array Elements...\n");
		for(int n:a)
		{
			if(n<0)
				System.out.println(n);
		}
    }
}