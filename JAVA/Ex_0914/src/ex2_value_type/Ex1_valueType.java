package ex2_value_type;

public class Ex1_valueType {

	public static void main(String[] args) {
		
		/*
		�ڷ���(�⺻�ڷ���) - ��� �ڷ����� �ҹ��ڷ� ������� �ִ�.
		������ : boolean
		������ : char
		������ : byte - 1byte : -128 ~ 127
			   short - 2byte : -32768 ~ 32767
			   int  - 4byte : -21�� ~ 21��
			   long  - 8byte : -900�� ~ 900��
		�Ǽ��� : float - 4.x byte
			   double  - 8.x byte 
		 */
		
		//���� : Ư������ �����ϱ� ���� �������
		//���� ���� ��Ģ
		//�ڷ��� ������; <-- ������ ����
		//������ = ��; <-- ����
		//�ڷ��� ������ = ��; <--����� ������ ���ÿ�!(�ʱ�ȭ)
		int a = 100;
		
		//�����̸����� ��Ģ!!!
		//1) ������ �̸��� ���� ���� �ݵ�� �ҹ��ڷ� ���� 
		//2) _�� �����ϰ� Ư�����ڸ� ������� �ʴ´�.
		//3) �ѱ۷� ������ �̸��� ���� �ʴ´�.
		
		//---------------------------------------------------------------
		
		//������ : true, false��, ���� ������ �ΰ��� ���� ������ �� �ִ�.
		boolean b;
		b = true;
		System.out.println("b : " + b);
		
		//�ڷ����� ���缭 ���� �־�����ϸ�, �ѹ� �� ������ ��Ȱ���� �����ϴ�.
		b = false;
		System.out.println("b : " + b);
		
		//���� �޼��� �ȿ� �̹� �ִ� ��Ī���� ������ �����Ϸ��� �ϸ� ������ �߻��Ѵ�.(���� �ߺ� ���� ����)
		//boolean b -> �Ȱ��� ��Ī�� �� �� ����.(�ߺ��� �̸��� ������ ���� ����� ���� �Ұ����ϴ�.)
		
		boolean ba = true;
		System.out.println("ba : " + ba);

		System.out.println("---------------------------------------------------------------");
		
		//������ : �������� �ݵ�� Ȭ����ǥ �ȿ� �ѱ��ڸ� ���� ������ �ڷ���
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		//10������ 65�� �ƽ�Ű�ڵ�� �ٲٸ� A�� ���´� (66�� B�̴�.)
		char ch2 = 65 + 1;
		System.out.println("ch2 : " + ch2);

	}//main
	
}