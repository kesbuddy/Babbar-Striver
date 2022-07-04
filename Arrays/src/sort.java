
public class sort {
	
	public static int[] Sorted(int []arr) {
		
		for(int i = 0;i<arr.length;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
		return arr;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,3,0,-2,8,5,7};
		Sorted(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}

}
