package Thread1;

import java.util.Timer;

public class TimerTaskCreate {
	
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		timer.schedule(new MyTimerTask(),2000);
		
		
	}
	

}
