package s0616;

public class Test13 {
	
	int num = 3;
	
	static void a(int a, int b) {
		a = 3;
		
	}
	
	
	static int num1() {
		return 1;
	}
	static int num2() {
		return 2;
	}
	 
	public static void main(String[] args) {
		Test13 t13 = new Test13();
		a(0,1);
		
		
		int a = num1();
		System.out.println(num1());
		
		int b = 1;
		System.out.println(t13.num);
		
	}
}
