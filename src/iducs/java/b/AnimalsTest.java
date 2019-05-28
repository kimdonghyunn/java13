package iducs.java.b;

public class AnimalsTest {
	public static void enable(Animals animal) {
		animal.breathe();
		animal.eat();
		animal.move();
		animal.sound();
		
	}
	
	public static void main(String[] args) {
		String str1="�δ����б�";
		String str2="��ǻ�ͼ���Ʈ�����а�";
		
		System.out.println(str1.compareTo(str2));
		
		Animals human = new Human();
		enable(human);
		//human.breathe();
		// ����ð��� ������ �߻���, ������ å���Ͽ� Ŭ���� ����ȯ�� ������ -> �����Ϸ��� �ϰ� ����
		//((FamilyCustomer) human).applySale(5000.00);
		
		human = new FamilyCustomer();
		enable(human);
		// Human -> Customer -> FamilyCustomer : �޼ҵ尡 �߰� , ������ ��
		//human.breathe();
		// ������ �������� ������ Ȯ��, ����ð����� ���� ��ü�� ����
		((FamilyCustomer) human).buy("��", 10000.00);
		
		human  = new VipCustomer();
		enable(human);		
		human.breathe();
		// ������ �������� ������ Ȯ��, ����ð����� ���� ��ü�� ����
		((VipCustomer) human).buy("��", 10000.00);
	}
}
