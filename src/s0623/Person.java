package s0623;

public class Person {
	private String name;
	private int age;
	private String address;
	
	
	public String toString() {
		return "name : "+ name + "\rage : " + age +"\raddress : " + address;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
