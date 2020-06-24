package s0624;

public class StringArray3 {
	public static void main(String[] args) {
		String str = "4,23,16,33,32,12,6,5,24,27";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		int[] nums1 = new int[strs.length];
		
		for(int i=0;i<strs.length;i++) {
			
			nums[i] = Integer.parseInt(strs[i]);
			
		}
		for(int i=0;i<strs.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums1[i]=nums[i]);
			}else {
				System.out.println(nums1[i]);
			}
		}
		/*for(int num:nums) {
			if(num%2==0) {
			System.out.println(num);
			}
		}*/
	}
}
