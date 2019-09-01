package Thread;

public class MMTest {

	public static void main(String[] args) {
		
		MyTread s = new MyTread("ss0");
		MyTread s1 = new MyTread("ss1");
		MyTread s2 = new MyTread("ss2");

		
//		MyRunnable mr = new MyRunnable();
//		
//		Thread th  = new Thread(mr,"s");
//		Thread th1  = new Thread(mr,"s1");
//		Thread th2  = new Thread(mr,"s2");
		
//		th.start();
//		th1.start();
//		th2.start();
		
		s.start();
		s1.start();
		s2.start();

	}

}
