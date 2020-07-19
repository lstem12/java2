package s0619;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] nums = new int [8];
		int[] tmp = new int [1];
		
		//System.out.println(nums.length);
		for(int i=0;i<nums.length;i++) {
			
			nums[i]= i+1;
			System.out.println("num[" + i +"]=" + nums[i]);
		}
		tmp[0] = nums[4];
		nums[4] = nums[6];
		nums[6] = tmp[0];
		
		System.out.println(nums[4]);
		System.out.println(nums[6]);
	}
}
