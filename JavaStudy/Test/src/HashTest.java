import java.util.Arrays;
import java.util.List;

public class HashTest {

	public static void main(String[] args) {
		
		String as[] = {"那","是","最","美","的"};
		
		List<String> list = Arrays.asList(as); 
		
		for (String stringa : list) {
			System.out.println(stringa);
			
		}
		
		
		//不可调用构造方法
		HashTest zs = new HashTest();
		short i=103 ;
		char c=(char)i;
		System.out.println("output:"+c);
		
		char c1 = ' ';
		
		int nm  = c1;
		
		int nna = 122;
		
		char qwq = (char) nna;
		
		System.out.println(qwq);
		
		
		System.out.println(nm); 
		
		byte sk = 58;
		sk = (byte) (sk + 8);

	}
	
	 public HashTest(){
		 
		 System.out.println("aaaa");
		 
	 }

}
