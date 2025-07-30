 // Encapsulation
 //Parent is Book
  

package sample;

public class BookChild {

	public static void main(String[] args) {
		Book obj = new Book();
		obj.setPrice(100);		
		System.out.println("Initial price is "+obj.getPrice());
		System.out.println("Discounted price is "+obj.applyDiscount(10));


	}

}
