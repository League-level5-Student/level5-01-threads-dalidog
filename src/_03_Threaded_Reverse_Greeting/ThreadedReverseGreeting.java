package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	
	public static void main(String[] args) {
		makeThreads(50);
	}
	
	static void makeThreads(int n) {
		if(n==0) {
			return;
		}
		Thread x = new Thread(()->{
			System.out.println("Hello from thread " + n);
			makeThreads(n-1);
		});
			x.start();
		
		
		}
	
	
}
