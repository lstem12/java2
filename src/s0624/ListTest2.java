package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("모니터");
		strList.add("노트북");
		strList.add("컴퓨터");
		
		int idx = strList.indexOf("컴 퓨터");
		System.out.println(idx);
		
	}
}
