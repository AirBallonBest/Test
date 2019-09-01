package cn.sort;

public class InsertSort {

	
	//直接插入排序
	public static void main(String[] args) {
		
		int[] arr = {23,59,8,10,5};
		InsertSort.insertsort(arr);
	}
	
	public static void insertsort(int[] arr){
		
		int n = arr.length;
		int tmp = 0;
		for(int i=0;i<n;i++){
			int value = arr[i];
			int j = 0;
			for(j = i-1;j>=0;j--){
				if(arr[j]>value){
					tmp	=  arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}								
			}
			
			
		}
		
		for (int isa : arr) {
			
			System.out.println(isa);
			
		}
		
	}
	
}
