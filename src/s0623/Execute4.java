package s0623;

public class Execute4 {
	public static void main(String[] args) {
		Cat[] cats = new Cat[2];
		for(int i=0;i<cats.length;i++) {
			cats[i] = new Cat();
		}
		cats[0].setName("동동이");
		cats[0].setAge(7);
		System.out.println(cats[0]);
	}
}
