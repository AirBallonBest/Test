package JavapPerUtil;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		String as[] = {"那","是","最","美","的"};
		List<String> li = ConverArr.list(as);
		
		for(String az:li){
			System.out.println(az);
		}

	}

}
