package iducs.java.b;

public class Human extends Mammal {
	// 구현된 클래스는 자동적으로 재정의 하지 않음
	@Override // <= annotation : java compiler에게 주는 주석, 속성 정보
	//,  abstract method implementation
	public void move() { // 구현에 대한 기준을 바탕으로 실제 구현
		// TODO Auto-generated method stub
		System.out.println("걷고, 뛰고, 기고, 메달리고");
	}
	// Method Overloading
	public void move(String transport) { // 구현에 대한 기준을 바탕으로 실제 구현
		// TODO Auto-generated method stub
		System.out.println(transport + "를 타고 이동한다.");
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("말을 한다");
	}
}
