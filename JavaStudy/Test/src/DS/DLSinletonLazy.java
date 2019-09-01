package DS;

public class DLSinletonLazy {
	
	
	/**
	 * 双重锁懒汉式单例
	 * */
	private static DLSinletonLazy dLSinletonLazy;
	
	public DLSinletonLazy(){
		
	}
	
	public static DLSinletonLazy getInstance(){
		
		if(null== dLSinletonLazy){
			
			synchronized (DLSinletonLazy.class) {
				
				if(null == dLSinletonLazy){
					
					dLSinletonLazy = new DLSinletonLazy();
				}
				
			}
			
		}
		
		return dLSinletonLazy;
	}
	
	public void nu(){
		System.out.println("sss");
	}
	
	public static void main(String[] args) {
		getInstance().nu();
	}

}
