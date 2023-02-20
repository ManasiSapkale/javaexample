import java.util.Scanner;
class bigOfArray
{

		public static void main(String args[])
{
		int sum=0,i;
		//scanner object
		Scanner bs=new Scanner(System.in);
		System.out.println("Enter num of elements in array");
		int ns=bs.nextInt();//reading length of array
		
		int arr[]=new int[ns];//creating array of specific size
		
		System.out.println("Hey pls enter array values");
		for(i=0;i<ns;i++)
		{
			arr[i]=bs.nextInt();//reading array values
		}
		
		int big=arr[0];
		//2,4,5,7,1;
		//4>2
		//1>7
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>big)	
			{
				big=arr[i];
			}
		}
		System.out.println("The Biggie is:"+big);







}

}