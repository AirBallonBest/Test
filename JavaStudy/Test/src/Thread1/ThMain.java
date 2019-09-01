package Thread1;

public class ThMain {

	public static void main(String[] args) {
		
		Thsx th = new Thsx("sss");
		Thsx th1 = new Thsx("qqq");
		th.start();
		th1.start();
	}

}
