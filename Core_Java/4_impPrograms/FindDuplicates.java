public class FindDuplicates
{
   public static void main(String []args)
   {
      int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
     
      for (int i = 0; i < array.length; i++)
         {
    	    for (int j=i+1; j<array.length; j++)
    	   //matching 2nd ele of array so i+1	
            {
             if (array[i] == array[j])
              {
                System.out.println(array[i]);
              }
            }
         }
    }  
}