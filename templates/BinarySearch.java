public class BinarySearch{
	public int binarySearch(int[] arr, int target) {
		
		int l =0, r = arr.length;

		while(l<r) {
			int m = (l+r)/2;
			if(arr[m] < target) l = m+1;
			else r = m;
		}

		return l;
	}
}