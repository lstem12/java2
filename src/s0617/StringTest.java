package s0617;

public class StringTest {
	
	//String str = "1";
	static int length(String str) {
		int cnt=0;
		for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		
		/*StringTest st1 = new StringTest();//new 인스턴스화
		StringTest st2 = new StringTest();
		
		System.out.println(st1);
		System.out.println(st2);
		
		String str = "1";
		
		System.out.println(st1.str==st2.str);
		System.out.println(st2.str==str);*/
		
		String str = "123452";
		int cnt = length(str);
		System.out.println();
		System.out.println("str의 글자수 : " + cnt);
		
		//System.out.println(str.length());
		//System.out.println(str.indexOf("2") + "," + str.indexOf("4"));
		//System.out.println(str.lastIndexOf("2"));
		
		//System.out.println(str.replace("23", "**")); //매칭되는 글자를 바꾸는것

		
	}
}
