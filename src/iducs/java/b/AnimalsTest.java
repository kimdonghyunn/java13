package iducs.java.b;

public class AnimalsTest {
	public static void enable(Animals animal) {
		animal.breathe();
		animal.eat();
		animal.move();
		animal.sound();
		
	}
	
	public static void main(String[] args) {
		String str1="인덕대학교";
		String str2="이퓨터소프트웨어학과";
		
		System.out.println(str1.compareTo(str2));
		
		Animals human = new Human();
		enable(human);
		//human.breathe();
		// 실행시간에 오류가 발생함, 개발자 책임하에 클래스 형변환을 수행함 -> 컴파일러는 믿고 진행
		//((FamilyCustomer) human).applySale(5000.00);
		
		human = new FamilyCustomer();
		enable(human);
		// Human -> Customer -> FamilyCustomer : 메소드가 추가 , 재정의 됨
		//human.breathe();
		// 컴파일 시점에는 유형을 확인, 실행시간에는 실제 객체를 참조
		((FamilyCustomer) human).buy("옷", 10000.00);
		
		human  = new VipCustomer();
		enable(human);		
		human.breathe();
		// 컴파일 시점에는 유형을 확인, 실행시간에는 실제 객체를 참조
		((VipCustomer) human).buy("옷", 10000.00);
	}
}
