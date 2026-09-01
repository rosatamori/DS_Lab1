//Centre College

public class Lab1 {

	/**This function will return the sum of the squares from 1 to n.
	* For instance if the number is 5, the solution would be 1*1+2*2+3*3+4*4+5*5= 55. 
	* If the value of n is less than 0, return -1
	*/
	   public static int squares(int n)
	   {
		   //less than 0
		   if(n < 0) {
			   return -1;
		   }
		   
		   int sumS = 0;
		   
		   //sum the squares
		   for(int count = 1; count <= n; count++) {
			   sumS = sumS + (count * count);
		   }
		   
	      return sumS;  
	   
	   }

	/**
	* This function that takes an array of integers and
	* an integer that describes how many numbers are in the array.  
	* The function will return the index(position) in the array with the largest number.
	* If the array is empty or there is an error, return -1.
	* If the maximum value is not unique, return the index of the first maximuim value.
	*/
	   public static int maxIndex(int array[],int len)
	   {
		   //if array is empty
		   if(len <= 0) {
			   return -1;
		   }
		   
		   int largestNum = array[0];
		   int index = 0;
		   
		   //search for largest num
		   for(int count = 0; count < len; count++) {
			   if(array[count] > largestNum) {
				   index = count;
				   largestNum = array[count];
			   }
		   }
		   
	      return index;
	   }

	/**
	* This function that takes an array of integers, 
	* an integer that describes how many numbers are in the array.  
	* and a target number to look for.
	* This function will return true if the target number is within the array and false otherwise.
	*/
	   public static boolean seek(int array[],int len,int target)
	   {
		   for(int count = 0; count < len; count++) {
			   if(array[count] == target) {
				   return true;
			   }
		   }
		   
	      return false;      
	   }



	/**
	* This function takes an integer parameter and returns the nth number in the Fibonacci 
	* sequence.  The first 6 numbers of the sequence are as follows.  1,1,2,3,5,8.  Note
	* that 8 is the 6th number.  Be sure that your algorithm can return the
	* first and second Fibonacci numbers correctly.  You should solve this without recursion. 
	* If the input is below 1, retun 0;
	*/
	   public static int fib(int n)
	   {
		   //less than 1
		   if(n < 1) {
			   return 0;
		   }
		   //get fibonacci
		   else if(n == 1 || n == 2) {
			   return 1;
		   }
		   
		   int counter = 2;
		   int back2 = 1;
		   int back1 = 1;
		   int sum = 0;
		   
		   while(counter < n) {
			   sum = back1 + back2;
			   back2 = back1;
			   back1 = sum;
			   counter++;
		   }
		   
	      return sum;
	   }

}
