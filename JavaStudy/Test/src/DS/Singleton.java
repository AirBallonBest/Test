package DS;

public class Singleton {
	
	
	//饿汉式单例
	public static Singleton singleton = new Singleton() ;
	
	public Singleton(){
		
		
	}
	
	public static Singleton getInstance(){
		
		
		return singleton;
	}
	
	public static void ss(){
		System.out.println("申花是冠军！");
	}
	
	public static void main(String[] args) {
		getInstance().ss();
	}
	
}
