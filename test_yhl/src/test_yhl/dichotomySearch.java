package test_yhl;

public class dichotomySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,23,45,78,90,101};
		System.out.println(search(arr,45));
		System.out.println(sum(2));
	}
	
	private static int search(int[] arr, int key) {

		int start = 0;
		int end = arr.length -1;
		while(start<=end){
			int middle = (start + end )/2;
			if(key < arr[middle]) {
				end = middle -1;
			} else if(key > arr[middle]){
				start = middle +1;
			} else {
				return middle;
			}
		}
		return -1;
	}
	
	public static int sum(int num) {
		if (num>0) {
			return num + sum(num-1);
		} else {
			return 0;
		}
	}
	
	
	
	
	// TODO Auto-generated method stub
//	int[] arr = {12,21,4,32,43,34,32};
//	
//	for(int i =0; i<arr.length; i++) {
//		for(int j=i; j<arr.length; j++) {
//			if(arr[i] >arr[j]) {
//				int tmp = arr[i];
//				arr[i] =arr[j];
//				arr[j] = tmp;
//			}
//		}
//	}run 
//	for(int z =0; z<arr.length; z++) {
//		System.out.println(arr[z]);
//	}
}
