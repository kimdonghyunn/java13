package iducs.java.b;

public abstract class Customer extends Human {
	
	abstract double applySale(double price);
	
	public void buy(String item) {
		System.out.println(item + " 을 구입하다.");		
	}
	public void insertCart(String item) {
		System.out.println(item + "을 장바구니에 담다.");
	}
}
