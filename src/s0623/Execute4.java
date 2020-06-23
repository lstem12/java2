package s0623;

import java.util.Random;

public class Execute4 {
	public static void main(String[] args) {
		Cat[] cats = new Cat[20];
		
		Random ran = new Random();
		
		for(int i=0;i<cats.length;i++) {
			int num = ran.nextInt(40)+1;
			cats[i] = new Cat();
			cats[i].setName("고양이" + i);
			cats[i].setAge(num);
		}
		/*for(int i=0;i<cats.length;i++) {
		System.out.println(cats[i]+"\r");
		}*/
		for(Cat cat:cats) {
			System.out.println(cat);
		}
	}
}
