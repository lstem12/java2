package s0619;

import s0619.sub.SubTest;

public class AccessTest extends SubTest {
	public void test(){
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		//at.num1 = 10;
		//at.num2 = 10;
		
		at.test();
		
	}
}
