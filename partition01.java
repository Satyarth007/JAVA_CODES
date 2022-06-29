
/* 
  	Problem:- Given an array containing 0s and 1s. Write an algorithms to sort array
	so that 0s come first followed by 1s. Also find the minimum number of swaps
	required to sort the array.*/
public class partition01 {
	public static int partitionZeroOne(int[] arr) {
		int low=0;
		int high=arr.length-1;
		int count=0;
		while(low<high) {
			while(arr[low]==0) {
				low++;
			}
			while(arr[high]==1) {
				high--;
			}
			if(low<high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
		int noOfSwaps=partitionZeroOne(arr);
		System.out.println("NUMBER OF SWAPS :: "+noOfSwaps);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" :: ");
		}

	}

}
