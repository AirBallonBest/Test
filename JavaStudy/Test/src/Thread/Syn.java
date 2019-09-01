package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Syn extends Thread{
	
	public  Object mutex = "sa";
	
	
	static  int nu = 50;
	@Override
	public   void run() {
		while(nu>0){
			
            synchronized (mutex) {
		
		  // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来  
        if (nu > 0) {  
            System.out.println(Thread.currentThread() + "卖出了第" + nu + "张票");
           
            nu--;  
        } else {  
            System.out.println("票卖完了");  
        }  
        
        try {  
            sleep(100);//休息一秒  
       } catch (InterruptedException e) {  
           e.printStackTrace();  
       }  
            }
		}
		
	}


}
