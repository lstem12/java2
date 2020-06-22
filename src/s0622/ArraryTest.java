package s0622;

public class ArraryTest {
	public static void main(String[] args) {
		int[][] nums = new int[4][4];

		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				nums[i][j]=(i*4)+1+j;
				
			}
				
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("nums[%d][%d]=[%d]\r", i,j,nums[i][j]);
			}
		
		}
		
	}
}
