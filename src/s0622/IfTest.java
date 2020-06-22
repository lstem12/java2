package s0622;

public class IfTest {

	public static void main(String[] args) {
		//double d = Math.random();
		//int num = (int)(d*20) + 1 ;
		
		System.out.println("검증시작");
	
	for(int i=1;i<=10000;i++) {
		
		double d = Math.random();
		int num = (int)(d*20) + 1 ;
		
			if(num<1 || num>20) {
				System.out.println("거짓말");
			}
		}
		
		System.out.println("검증완료");

		//System.out.println(num);
		
		/*int num1 = 1;
		int num2 = 10;
		int num3 = 20;
		
		if(num1>1 && num2<20 && num3 == 21) {
			System.out.println("트루");
		}*/
	}
}
