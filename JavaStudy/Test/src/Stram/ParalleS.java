package Stram;


import java.util.Arrays;
import java.util.List;

public class ParalleS {
	
	public static void main(String[] args) {
		List<Integer> i=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println("stream.forEach打印结果如下");
		i.stream().forEach(System.out :: print);//固定结果 1234567
		System.out.println("parallelStream.forEach打印结果如下");
		i.parallelStream().forEach(System.out :: print);//每次的结果都不同
		System.out.println("parallelStream.forEachOrdered打印结果如下");
		i.parallelStream().forEachOrdered(System.out :: print);//结果同stream.forEach

		
	}
	
	

}
