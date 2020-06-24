package s0624;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age +"]";
	}
}

public class ListTest3 {
	
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person());
		pList.add(new Person());
		pList.add(new Person());
		
		//Person p = pList.get(1);
		pList.get(0).setName("0번방사람");
		pList.get(0).setAge(25);
		pList.get(1).setName("1번방사람");
		pList.get(1).setAge(34);
		pList.get(2).setName("2번방사람");
		pList.get(2).setAge(29);
		System.out.println(pList);
		
	}
}