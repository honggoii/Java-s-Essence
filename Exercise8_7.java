import java.util.Scanner;

public class Exercise8_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; //������Է��� ������ ����
		int count = 0; //�õ�Ƚ���� ���� ���� ����
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
			
			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. "
						+ "���ڸ� �Է����ּ���.");
				continue;
			}
			
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
				break;
			}
		} while (true);
	}
}
