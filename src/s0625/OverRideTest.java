package s0625;

class Port{
	public void grade() {
		System.out.println("A포트");
	}
	public String toString() {
		return "안녕하세요";
	}
}
class PortNum extends Port {
	public void grade() {
		System.out.println("21번");
	}
}
public class OverRideTest extends PortNum {
	
	public static void main(String[] args) {
		Port p = new OverRideTest();
		
		System.out.println(p.toString());
	}
}
