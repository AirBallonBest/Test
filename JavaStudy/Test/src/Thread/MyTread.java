package Thread;

public class MyTread extends Thread{
	
		 int key = 100;
	     private static  int ticket = 1;
	     public  MyTread(String name) {
	         super(name); // 调用父类带参数的构造方法
	     }
	     public void run() {
	         while (ticket <= key) { // 每个线程都拥有100张票，各自卖各自得票
	        	
	             String threadName = Thread.currentThread().getName();
	             System.out.println("【" + threadName + "】售出第【" + ticket++ + "】张票");
	         }
	    }

}
