
public class firstRepeatingElement {
	// BRUTE FORCE APPRAOCH -> 0(N^2)
	public static int answer(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
	
		int arr[]= {2,9,3,4,15,22,2,3};
		System.out.println("ANSWER :: "+answer(arr));

	}

}
