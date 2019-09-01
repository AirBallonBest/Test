
public class Test {
	public static int qw = 0;
	public int sq = 0;
	
	public Test() {
		
		qw++;
		sq++;
		System.out.println(qw+ "     " + sq);
	
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		Test z = new Test();
		
		System.out.println("sssss"+ t.test());
		boolean k = true;
		boolean m = false;
		boolean b = true;
		boolean p = false;
		
		if(b&k){
			System.out.println("&");
		}else{
			System.out.println("!&");
		}
		int  jh = 127;
		
		byte wq = (byte)jh;
		System.out.println(2&5);
		System.out.println(2<<3);
		System.out.println(wq);
		
		
	}
	
	public  int    test()

	    {

	       int x = 1;

	       try

	       {

	    	   System.out.println("asasasadadsdas"+ x);
	          return x;
	          
	         

	       }

	       finally

	       {

	          ++x;
	          
	          System.out.println("nnnnn"+ x);

	       }
	    }

}
