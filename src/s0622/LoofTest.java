package s0622;

public class LoofTest {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i=1;i<=1000;i++) {
			if(i%2==0) {
				num1=num1+i;
				
			}
			else {
				num2=num2+i;
				
			}
		}
		System.out.println("짝수의 합 : "+num1);
		System.out.println("홀수의 합 : "+num2);
		System.out.println("전체의 합 : "+(num2+num1));
		
	}
}
