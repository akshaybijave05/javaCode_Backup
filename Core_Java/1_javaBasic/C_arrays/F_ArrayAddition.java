package C_arrays;

public class F_ArrayAddition
{

	public static void main(String[] args)
{
		

		float[]a={22.2f,54.65f,10.0f,08.20f,12.12f};
		float addition=a[0]+a[1]+a[2]+a[3]+a[4];
		System.out.println(addition);
		float sum=0;
		for(float b:a)
		{
			sum=sum+b;
						
		}
		System.out.println("sum of array is:"+sum);
		
	
	}

}
