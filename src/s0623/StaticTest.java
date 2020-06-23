package s0623;

public class StaticTest {
	static String str;
	int num;
	public static void main(String[] args) {		
		System.out.println(str);
		StaticTest st = new StaticTest();
		System.out.println(st.num);
		st.num = 10;
		
		StaticTest st2 = new StaticTest();
		System.out.println(st2.num);
	}
}
