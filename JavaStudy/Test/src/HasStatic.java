
public class HasStatic {
	
	private static int x = 100;


	public static void main(String[] args) {
		
		HasStatic hs1 = new HasStatic();
	    hs1.x++;
	    HasStatic hs2 = new HasStatic();
	    hs2.x++;
	    hs1 = new HasStatic();
	    hs1.x++;
	    HasStatic.x--;
	    System.out.println("x=" + x);
	    
	    for(int x=0,y=0;(y!=0)&&(x<4);x++){
	    	System.out.println("sq");
	    }

	}

}
