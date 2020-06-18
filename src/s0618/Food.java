package s0618;

class JokBal extends Food{
	
}
class Donkass extends Food{
	
}
class DuckBBoki extends Food{
	
}
public class Food{ //extends Object 가 생략가능
	public static void main(String[] args) {
	Food f = new Food();
	f = new Donkass();
	f = new DuckBBoki();
	f = new JokBal();
	}
}
