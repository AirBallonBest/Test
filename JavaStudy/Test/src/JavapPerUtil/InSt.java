package JavapPerUtil;

public class InSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ioa("15987");
//		roll();
		System.out.println(fei(20));
	}
	
	public static void ioa(String k){
		int s = Integer.parseInt(k);
		
		System.out.println(s);
	}
	
	
	//打印0-9数字
	public static void roll(){
		int i=0;
		while(true){
		i = (i+1)%10;
		System.out.println(i);
			if(i == 0 ){
				break;
			}
		}
	}
	
	//斐波那契数列
	public static int  fei(int n){
		if(n == 1) {
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			
		return 	fei(n-1) + fei(n-2);
		}
		
	}
	

}
