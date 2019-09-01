package cn.fortest;

public class Rev {

	
	/*
	 *++操作翻转字符串
	 * */
	public static void main(String[] args) {
		
		String s = rever("aswdq");
		
		io("qwertyuiop");
	
	}
	
	public static String rever(String sub){
		if(sub == null || sub.length()<=1){
			return null;
		}
		String a =  new String();
		int lk = sub.length()-1;
		int m = 0;
		for(int i=lk;i>=0;i--){

			a += sub.charAt(i); 
			
		
		}
		
		System.out.println(a);
		
		return a;
	}
	
	/**
	 * StringBuffer 翻转字符串
	 * */
	
	public static String io(String arg){
		
		StringBuffer sb = new StringBuffer(arg);
		
		String nk = sb.reverse().toString();
		
		System.out.println(nk);
		
		return nk;
		
	}

	
	

}
