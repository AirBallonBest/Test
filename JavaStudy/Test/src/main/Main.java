package main;

import JavapPerUtil.CountWordsNum;
import Thread.Syn;

public class Main {

	public static void main(String[] args) {
		
//		String shenhua = "shen hua shi guan jun ";
//		
//		 int s = CountWordsNum.wordsNum(shenhua);
//		 
//		 System.out.println(s);
		
		
		//线程启动
		Syn s1 =  new Syn();
		
		Syn s2 =  new Syn();	
		Syn s3 =  new Syn();
		Syn s4 =  new Syn();
		s1.start();
		s2.start();
		s3.start();
		s4.start();

	}

}
