package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskq;
public Worker(ConcurrentLinkedQueue<Task>  taskq) {
	this.taskq=taskq;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(taskq.size()!=0) {
			taskq.remove().perform();
		
		}
	}


}
