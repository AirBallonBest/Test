package cn.fortest;

public class ST {

	public static void main(String[] args) {

		String op ;
		System.out.println();
		String a = "hello";
		String b = "he" + new String("llo");
		System.out.println(a == b );
		System.err.println(a == b );
		
		byte a1 = 127;
		byte b1 =  (byte) (a1+1);
		System.out.println(b1); // i + 1 <i
	}
	
	
	

}
