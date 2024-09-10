import java.util.Arrays;

public class MergeSort{

	public void merge(int[] arr, int[] aux, int low, int mid, int high) {
		int k = low, i = low, j=mid+1;

		while (i<=mid && j<=high) {
			if(arr[i] <= arr[j]) {
				aux[k++] = arr[i++];
			} else {
				aux[k++] = arr[j++];
			}
		}

		while(i<=mid){
			aux[k++] = arr[i++];
		}

		for(i=low; i<=high; i++) {
			arr[i] = aux[i];
		}

		System.out.println(Arrays.toString(aux));
	}


	public void msort(int[] arr, int[] aux, int low, int high) {
		if(high <= low) {
			return;
		}
		
		int mid = (low + ((high-low)/2));
		msort(arr, aux, low, mid);
		msort(arr, aux, mid+1, high);

		merge(arr, aux, low, mid, high);
	}
	

	public static void main(String[] args) {
		int[] arr = {12, 3, 18, 24, 0, 5, -2};
		int[] aux = Arrays.copyOf(arr, arr.length);

		MergeSort ms = new MergeSort();
		ms.msort(arr, aux, 0, arr.length-1);
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}