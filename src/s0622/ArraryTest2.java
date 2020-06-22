package s0622;

public class ArraryTest2 {
	public static void main(String[] args) {
		int[][] nums = new int[5][3];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = (i*nums[i].length)+j+1;
				
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.printf("nums[%d][%d]=[%d]\r", i,j,nums[i][j]);
			}
		}
	}
}
