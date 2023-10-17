package F_Multithreading;

//how many way to create/define a thread.
//multithreading o/p resultl not fix its simultaneously o/p result 
//1)by extending thread class   
//2)by implimenting Runnable interface

//2)by implimenting Runnable interface

class AkshayB implements Runnable//thread 
 {
   public void run() //only one method 
    {
    for(int i=1;i<=5;i++)
      {
        System.out.println("akshay");
      }
    }
 }
public class B_Multithreading 
  {
  public static void main(String[] args) 
  {
     AkshayB obj=new AkshayB();
     Thread t=new Thread(obj);//for start thread create a thread class object
     t.start();
   for(int i=1;i<=5;i++)
     {
       System.out.println("rupesh");
     }

   }

}
