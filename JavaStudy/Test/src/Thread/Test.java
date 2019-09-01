package Thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ThreadState ts = new ThreadState();
		Thread th = new Thread(ts);
		System.out.println("输出线程状态：+"+th.getState());
		th.start();
		System.out.println("输出线程状态：+"+th.getState());
		Thread.sleep(500);
		System.out.println("输出线程状态：+"+th.getState());
		Thread.sleep(2000);
		System.out.println("输出线程状态：+"+th.getState());
		ts.notifyNow();
		System.out.println("输出线程状态：+"+th.getState());
		Thread.sleep(2000);
		System.out.println("输出线程状态：+"+th.getState());
	}

}
