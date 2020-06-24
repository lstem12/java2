package s0618;

public class Dog extends Animal {
	
	public void speak() {
		System.out.println("강아지가 짓습니다");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.speak();
	}
}
