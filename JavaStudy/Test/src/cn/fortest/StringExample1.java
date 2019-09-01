package cn.fortest;

public class StringExample1{
       String str = new String("good");
       char[] ch = {'a', 'b', 'c'};
       public void change(String str, char[] ch){
           str = "test ok";
           ch[0] = 'g';
       }

       public static void main(String[] args) {
           StringExample1 ex = new StringExample1();
           ex.change(ex.str, ex.ch);
           System.out.print(ex.str+" and ");
           System.out.print(ex.ch);
           System.out.println();
           String str = "125";
           changeStr(str);
           System.out.println(str);
       }
       
       public static void changeStr(String str){
    	   str = "wel";
       }
   }