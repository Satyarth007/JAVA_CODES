/* Problem: Given an array containing 0s, 1s and 2s. Write an algorithms to sort
array so that 0s come first followed by 1s and then 2s in the end.*/
public class partition012 {
	public static void swap(int[] arr,int l,int r) {
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
	public static void partitionZeroOneTwo(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int i = 0;
		while (i <= right) {
			if (arr[i] == 0) {
				swap(arr, i, left);
				i += 1;
				left += 1;
			} else if (arr[i] == 2) {
				swap(arr, i, right);
				right -= 1;
			} else {
				i += 1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		partitionZeroOneTwo(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" :: ");
		}

	}

}
