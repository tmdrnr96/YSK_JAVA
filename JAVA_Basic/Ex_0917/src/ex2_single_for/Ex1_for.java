package ex2_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
		//for�� : Ư�� ������ ���ϴ� ��ŭ �ݺ������� �����ϱ� ���� �ݺ���
		//for(�ʱ��; ���ǽ�; ������){
		//	���ǽ��� ���� �� ����Ǵ� ����
		//}
		
		int n = 20; //��������
		//���������� ��Ȱ���� �����ϴ�.
		//������ ���������� ���� ���� �̸��� ���������� ����� �� ����.
		
		for(int i = 0; i < 3; i++){
			
			//i�� ���� Ư�� �����ȿ��� �ʱ�ȭ�Ǿ� ������� ������ ����������� �θ���.
			//���������� �ش� ������ ���������� ���� ����� �� ����.
			System.out.println("i : " + i);
			
		}//for
		
		/* for��
		 1. �ʱ��
		 2. ���ǽ�
		 3. (���ǽ��� ���� ���..)for�� ������ ���´�.
		 4. ������
		 5. ���ǽ�
		 6. (���ǽ��� ���� ���..)for�� ������ ���´�.
		 7. (1 ~ 6)���ǽ��� ������ ������ �ݺ�!
		 */
		
		System.out.println("------------------------------------");
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i : " + i);
		
		}//for
		
		System.out.println("------------------------------------");
		
		int a = 1;//���������� �ʱ�ȭ�� ���ϰ� ���������� Ȱ���Ͽ� ���� �ٲ㼭 Ȱ���� ���� �ִ�.
		for(a = 0; a <= 3; a++) {
			System.out.println("a : " + a);
		}//for
		
		System.out.println("------------------------------------");
		
		//���� �������� ���� �״�� ����ؼ� �ʱ���� �Ѿ�� ���ǽ����� �Ѿ��.
		//�ʱ��, ���ǽ��� ���� ��쵵 �ִ�.(���ǽ��� ������ ������ �ν��ؼ� ���ѹݺ�..)(�������� ���� ��쵵 ����)
		for(; a >= 0; a--) {
			System.out.println("a : " + a );
			
		}//for
		
		/*(���ѹݺ�) : 
		 * for(; ; ) { System.out.println("a : " + a );
		 * 
		 * }
		 */
		
		System.out.println("-----------------------------------");
		
		//���� : 1���� 100���� �ݺ��ϴ� for���� ����� 
		//�� �ȿ��� 3�� ����� ����Ͻÿ�!
		
		int num = 3;
		
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.println(i);
			}//if
			
		}//for
		
		System.out.println("------------------------------");
		
		for(int i = 1; i <= (100/num); i++ ){
			System.out.println(i * num);
		
		}//for
		
		
		
		
		
	}//main

}




















