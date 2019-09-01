package Thread;

public class MyRunnable implements Runnable {
	
	
		
	
	private int ticket = 1;

	@Override
	public void run() {
		
		while(ticket<=100){
			             String threadName = Thread.currentThread().getName();
			            System.out.println("【" + threadName + "】售出第【" + ticket++ + "】张票");
			
			
		}

	}

}
