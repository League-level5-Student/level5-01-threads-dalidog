package _04_Thread_Pool;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
ArrayList threadarray = new ArrayList();
ConcurrentLinkedQueue<Task> taskq = new ConcurrentLinkedQueue<Task>();
	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
		for (int j = 0; j < i; j++) {
			Thread x = new Thread(new Worker());
			threadarray.add(x);
		}
		
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskq.add(task);
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
