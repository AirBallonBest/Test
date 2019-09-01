package JavapPerUtil;


//约瑟夫环
public class Joseph {
	
	private static int All = 20;
	
	private static int cut = 7;
	
	public void  delete(){
		Node node =  new Node(1);
		Node x = node;
		for(int i = 2;i<=All;i++){
			x = (x.next = new Node(i));
			
		}
		x.next = node;//这里是将20位下一个 赋值为第一位
		System.out.println("删除顺序");
		while(x.next!=x){//第20位和第一位比较是否相等
			for(int i=1;i<cut;i++){
				x = x.next;
			}
			 System.out.println("被删除的 "+x.next.val);
			 x.next = x.next.next;
		}
		 System.out.println("保留的是"+x.val);
		
	}
	
	public static void main(String[] args) {
		Joseph j = new Joseph();
		j.delete();
	}

}
