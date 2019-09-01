package cn.fortest;

public class Forloop {
	
	 static boolean foo(char c){
         System.out.print(c);
         return true;
     }

	 //for
     public static void main(String[] args) {
         int i=0;
         for(foo('A');foo('B')&&(i<2);foo('C')){
             i++;
             foo('D');
         }
         System.out.println();
     }


}
