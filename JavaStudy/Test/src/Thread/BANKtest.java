package Thread;

public class BANKtest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		ATMBtest a1 = new ATMBtest(bank);
		BTest b1 = new BTest(bank);
		
		a1.start();
		b1.start();

	}

}
