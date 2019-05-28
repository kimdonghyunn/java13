package iducs.java.b;

public abstract class Mammal implements Animals {
	abstract public void move();
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	abstract public void sound();
	
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("¼ûÀ» ½®´Ù : ½ÉÀåÀ¸·Î");
	}

}
