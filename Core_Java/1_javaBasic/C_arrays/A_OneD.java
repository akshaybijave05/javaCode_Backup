package C_arrays;
/*arrays is an object in java, which contains a similar type of data
in a continuous memory location. array index start with 0
type---1)1D array 2)2D array or multi diamensional array.*/


public class A_OneD
{

	public static void main(String[] args)
	{
	  /*int[]a=new a[5];
		a[0]=1;
		a[1]=2;*/
		
		
		int a[]= {10,20,30,40,50};//one diamensional array
		System.out.println("array third value print:");
		System.out.println(a[2]);
		 //for each loop only use with an array
		  for(int b:a)//for each loop help print all array elements
		 {
			 System.out.print(b+"   ");
		 }
	}
}
