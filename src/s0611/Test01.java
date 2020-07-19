package s0611;

public class Test01 {
	interface Car{		
	}		
	class Kia implements Car{		
	}		
	class Hyundai implements Car{		
	}	
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//Car c = new Kia();		
		//Car c1 = new Hyundai();		
		//Car c2 = new Car(); //인터페이스는 몸통을 만들거나 메모리 생성이 불가		
		//Kia k = new Hyundai(); //Car의 자식들은 서로를 알지 못한다.	
		
	}
}
