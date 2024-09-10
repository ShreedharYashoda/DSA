import java.util.*;

class Subsets {
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){ 
	
		list.add(new ArrayList<>(tempList));
		// System.out.print("Added ");
		// System.out.print(tempList);
		// System.out.println();
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			System.out.println("For start->" + start + " i->"+ i + " added "+ nums[i]+" " + tempList);
			backtrack(list, tempList, nums, i + 1);
			// System.out.println("Calling backtrack with " + tempList + " start as " + (i+1) );
			int rem = tempList.remove(tempList.size() - 1);
			System.out.println("For start->" + start + " i->"+ i + " removed "+ rem+" " + tempList);
		}
	}

	public static void main(String[] args) {
		Subsets s = new Subsets();
		List<List<Integer>> ans = s.subsets(new int[]{1,2,3});

		System.out.println(ans);
	}
}