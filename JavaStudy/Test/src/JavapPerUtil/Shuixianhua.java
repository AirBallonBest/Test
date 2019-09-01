package JavapPerUtil;

public class Shuixianhua {

	
	//求水仙花数
	public static void main(String[] args) {
		
		
		shui();
		
	}
	
	public static void shui(){
		
		for(int i=100;i<1000;i++){
			
			int s = i  % 100 ;
			int k = s % 10;
			int x = i / 100;
			int za = s/10;
			
			if(((int)Math.pow(k, 3) + (int)Math.pow(x, 3)  + (int)Math.pow(za, 3) ) == i){
				System.out.println(i);
			}
			
			
		}
		
	}

}
