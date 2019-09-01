package JavapPerUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverArr {
	
	//字符串数组转换成List集合
	public static List list(String arr[]){
		
		List<String> lista = new ArrayList<String>(Arrays.asList(arr));
		
		
		return lista;
		
	}
	
	
	//list转换成字符串数组
	public static String[] arrs(List list){
		
		String[] array = (String[]) list.toArray(new String[list.size()]);
		
		return array;
		
	}

}
