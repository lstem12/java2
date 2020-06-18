package s0617;

public class Constructor {
	
	Constructor(){
		System.out.println("쉬운 클래스 아님");
	}
	public static void main(String[] args) {
		/*Constructor c;
		System.out.println("c에 메모리 생성해서 대입");
		c = new Constructor();//생성자는 데이터 타입이 없다. 클래스의 이름과 대소문자까지 동일하다.
		System.out.println("c에 메모리 생성해서 대입12");*/
		
		Constructor c = new Constructor();
		System.out.println(c);
	}
}
