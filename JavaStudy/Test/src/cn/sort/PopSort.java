package cn.sort;

public class PopSort {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,6,7,11,9};
		pop(arr);

	}
	
	public static void pop(int arr[]){
		int s = arr.length;
		int tem = 0;
		for(int i=0;i<s;i++){
			for(int j=0;j<s -1;j++){
				if(arr[j]>arr[i]){
					tem = arr[j];
					arr[j] = arr[i];
					arr[i] = tem;
				}
			}
		}
		
		for( int ss: arr){		
			System.out.println(ss);						
		}
		
		
	}

}
