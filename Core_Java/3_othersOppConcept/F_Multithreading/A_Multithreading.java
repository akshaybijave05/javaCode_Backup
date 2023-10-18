package F_Multithreading;
/*multithreading__ multithreading is a process to execute multiple thread at the same time without any 
 dependency of other thread is callled as multithreading.
#note--used then the save time & perfoemance speed increases.


#thread--thread is a pre-defined class,which is available in 'java.lang'package.
Thread is a basic unit of cpu & it is well known for independent execution.
*Every java application has at least one thread - main thread. 


how many way to create/define a thread.
1)by extending thread class
2)by implimenting Runnable interface*/

//1)by extending thread class 


class akshay extends Thread // define a thread(child thread)
{
	@Override // override method cant used throws its handle try and catch used
	
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("akshay");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class A_Multithreading {
	
	public static void main(String[] args) throws InterruptedException {
		
		akshay obj = new akshay();
		obj.start(); // start() is a thread method its self call
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("rupesh");
			Thread.sleep(1000);
		}
	}
}
