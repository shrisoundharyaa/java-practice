import java.util.Scanner;
class Array_Second_Smallest
{  
	public static int SecondSmallest(int[] a, int len){  
	int t;  
	for (int i = 0; i < len; i++)   
		{  
			for (int j = i + 1; j < len; j++)   
			{  
				if (a[i] > a[j])   
				{  
					t = a[i];  
					a[i] = a[j];  
					a[j] = t;  
				}  
			}  
		}  
	   return a[1]; 
	}  
	public static void main(String args[])
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
		System.out.println("Second Smallest Number is : "+SecondSmallest(a,l)); 
	}
}  