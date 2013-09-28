// Jason Secatore
//Homework 1 Anaylsis of Algorithms 
// 09/14/2013
// I populated an array with 100,000 integers so there would be a measurable amount in the run time
import java.util.*;

class HomeWork1
{
// returns the max value of an int array
	public static int maxVal(int[] array)
	{
		if(array.length<1)
			System.out.println("Array is empty. ");
		int max= array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	
	public static void main(String[] args)
	{
		Random generator= new Random();
		generator.setSeed(System.currentTimeMillis());
		int[] myArray=new int[100000];
		long t1=System.currentTimeMillis();//Starting time ofrandom # generaton and array population algorithm
		
		for(int i=0;i<myArray.length;i++)// Generate random numbers between 0 and 10000000 to populate the array
			myArray[i]=generator.nextInt(10000001);
			
		
		long total = System.currentTimeMillis()-t1;//execution time of array # generation and population
		long algStart=System.currentTimeMillis();
		int x=HomeWork1.maxVal(myArray);
		long algFinish=System.currentTimeMillis()-algStart;//time for maxVal method to execute
		System.out.println("The max value of the indicated numbers is " + x);
		System.out.println("The total time for the random int generation and array population to execute was: "+ total  + " milliseconds.");
		System.out.println("The total time for the maxVal() method to execute was: "+ algFinish  + " milliseconds.");
		
		
		
		
		
	}
}