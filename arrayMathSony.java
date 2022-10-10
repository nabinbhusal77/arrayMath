// Java program to demonstrate
// passing of array to method

public class Test
{
	// Driver method
	public static void main(String args[])
	{
		int arr[] = {32,96,15,45,12,38,67,12,18};
		//An object must be created first
		myMath m1 = new myMath();
		// passing array to method m1
		m1.sum(arr);
		m1.avg(arr);
		m1.lowest(arr);
		m1.highest(arr);
		m1.findstackSize(arr);
	}

}

class myMath{
int stackTop;


	public static void StackSize(int[] arr)
	{
		// getting sum of array values
		int topSpot = arr.length;
		System.out.println("Top of the stack is : " + topSpot);
	}
	
	public static void findstackSize(int [] arr)
	{
		StackSize(arr);

	}

	public static void lowest(int[] arr)
	{
		int lowestNumber = arr[0];
		for (int i =0; i< arr.length; i++)
			if (arr[i] < lowestNumber)
				lowestNumber = arr[i];

	System.out.println("Array Lowest Value : " + lowestNumber);
	}
	public static void highest(int[] arr)
	{
		int highestNumber = arr[0];
		for (int i =0; i< arr.length; i++)
			if (arr[i] > highestNumber)
				highestNumber = arr[i];

		System.out.println("Array Highest Value : " + highestNumber);

	}
	public static void sum(int[] arr) 
    {
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        
        System.out.println("Array Total Sum : " + totalSum);
    }
    
    public static void avg(int[] arr) 
    {
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }
        
        int average = totalSum / arr.length;
        
        System.out.println("Array Average Value : " + average);
    }

}
