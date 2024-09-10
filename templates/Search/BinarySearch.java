public class BinarySearch {
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

/*
	https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	https:// leetcode.com/problems/search-insert-position/
	https:// leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/
	https:// leetcode.com/problems/first-bad-version/
	https:// leetcode.com/problems/find-smallest-letter-greater-than-target/
	https:// leetcode.com/problems/sqrtx/
	https:// leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
	https:// leetcode.com/problems/random-pick-with-weight/
	https:// leetcode.com/problems/capacity-to-ship-packages-within-d-days/
	https:// leetcode.com/problems/koko-eating-bananas/
	https:// leetcode.com/problems/split-array-largest-sum/
	https:// leetcode.com/problems/divide-chocolate/
	https:// leetcode.com/problems/missing-element-in-sorted-array/
*/