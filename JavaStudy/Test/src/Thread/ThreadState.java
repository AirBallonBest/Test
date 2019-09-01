package Thread;

public class ThreadState implements Runnable {
	
	public synchronized void waitForASecond() throws InterruptedException{
		
		wait(1000);
	}
	
	public synchronized void waitForYear() throws InterruptedException{
		wait();
	}
	
	public synchronized void notifyNow(){
		notify();
		
	}

	@Override
	public void run() {
		
		try {
			waitForASecond();
			waitForYear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
