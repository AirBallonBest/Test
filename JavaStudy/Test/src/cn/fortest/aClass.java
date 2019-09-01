package cn.fortest;

public class aClass {
	

	static int i = 0;  
    void fun() {  
    	
    	//局部变量前不能放置任何访问修饰符 (private，public，和protected)。final可以用来修饰局部变量
        //int i = 0;
    	i++;  
        System.out.println(i);// 分别打印输出1
    }  
  
    public static void main(String args[]) {  
//        aClass obj = new aClass();  
//        obj.fun();  
//        obj.fun();  
    	
    	si();
    }  
    
    public static void si(){
    	String a = "ab";
    	String b = "a" + "b";
    	String c = "a";
    	String d = "b";
    	String e = c + d;
    	
    	System.out.println(a== b);//放在常量池
    	System.out.println(e==b);//放在堆区
    	System.out.println(a.equals(b));
    	System.out.println(b.equals(e));
    	
    	String f = b.intern();
    	System.out.println(f == b);
    }
    
    
    public static void sk(){
    	
    	String s0= "kvill"; 
    	String s1= "kvill"; 
    	String s2="kv" + "ill"; 
    	System.out.println( s0 ==s1 ); 
    	System.out.println( s0==s2 );
    }


}
