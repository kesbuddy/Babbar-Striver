
public class binary_search {
	
	public static int BinarySearch(int []arr,int elem) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(elem==arr[mid]) {
				return mid;
			}
			else if(elem>arr[mid]){
				start = mid+1;
			}
			else if(elem<arr[mid])
				end = mid-1;
			}
		return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int num = BinarySearch(arr, 3);
		System.out.println(num);

	}

}
