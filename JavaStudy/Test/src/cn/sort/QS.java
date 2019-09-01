package cn.sort;

public class QS {
	
	public static void me(int arr[],int left,int right){
		
		if(left<right){
			int	mid = (left+right)/2; 
			me(arr,left,mid);
			me(arr,mid+1,right);
			mee(arr,left,mid,right);
			
		}
	}
	
	public static void mee(int arr[],int left,int mid,int right){
		
		int temp[] = new int[right - left + 1];
		int i = left;
		int j = mid+1;
		int k = 0;
		
		while(i<=mid && j<=right){
			if(arr[i]<arr[j]){
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}	
		}
		
		while(i<=mid){
			temp[k++] = arr[i++];
		}
		while(j<=right){
			temp[k++] = arr[j++];
		}
		
		for(int mz = 0;mz<temp.length;mz++){
			arr[mz+left] = temp[mz];
		}
		
		
	}
	
    public static void main(String args[]){
        int[] test = {1,3,5,2,4,6};
        me(test,0,test.length-1);
        for(int i=0; i<test.length;i++){
            System.out.print(test[i] + " ");
        }
    }

}
