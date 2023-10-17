package C_ExceptionHandling;
//Java finally block is a block used to execute important code such as closing the connection, etc

class D_Finally
{
    public static void main(String[] args)
    {
        try {
              System.out.println("inside try block");
              // Not throw any exception
              System.out.println(34 / 2);
            }
        
         // Not execute in this case
        catch (ArithmeticException e) 
        {
            
            System.out.println(e);
            
        }
         // Always execute
        finally
        {
            
            System.out.println("finally : i execute always.");
            
        }
    }
}