package Thread1;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		
		System.out.println("Timer子线程已经启动。。");

	}

}
