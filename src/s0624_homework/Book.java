package s0624_homework;

public class Book extends BookStore {
	public void book(){
		System.out.println("책이름 : "+bookName+"\r책가격 : "+bookPrice+"\r저자 :"+writer+"\r");
	}
	
	public static void main(String[] args) {
		BookStore b = new Book();
		Book bs = new Book();
		b.bookName = "개미";
		b.bookPrice = 32000;
		b.writer = "베르나르베르베르";
		b.book();
		bs.book();

	}

}
