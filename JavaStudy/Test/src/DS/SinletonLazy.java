package DS;

public class SinletonLazy {
	
	
	//懒汉式单例
	//效率太低
	
	private static SinletonLazy sinletonLazy;
	
	public SinletonLazy(){
		
	}
	
	public  static synchronized SinletonLazy getInstance(){
		
		if(sinletonLazy == null) {
			
			sinletonLazy = new SinletonLazy();
			
		}
		return sinletonLazy;
		
	}
	
	public static  void nm(){
		System.out.println("qqqq");
	}
	
	public static void main(String[] args) {
		getInstance().nm();
	}

}
