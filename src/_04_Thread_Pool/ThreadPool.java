package _04_Thread_Pool;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
ArrayList<Thread> threadarray = new ArrayList<>();
ConcurrentLinkedQueue<Task> taskq = new ConcurrentLinkedQueue<Task>();
	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
		for (int j = 0; j < i; j++) {
			Thread x = new Thread(new Worker(taskq));
	
			threadarray.add(x);
		}
		
	}


	public void start() {
		// TODO Auto-generated method stub
		threadarray.stream().forEach(thread->thread.start());
		
	}



	public void addTask(Task task) {
		taskq.add(task);
	}


	

}
