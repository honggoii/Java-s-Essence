import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Practice10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("��¥��  " + pattern + "�� ���·� �Է����ּ���.(�Է¿�:2017/05/11)");
			try {
				inDate = df.parse(s.nextLine()); //�Է� ���� ��¥�� Date�� ��ȯ
				break; //parse���� pattern��� �Է��ϸ� ����
			} catch (Exception e) {
				System.out.println("��¥�� " + pattern + "�� ���·� �ٽ� �Է����ּ���.(�Է¿�:2017/05/11)");
			}
		} while(s.hasNextLine());
		
		
		  Calendar cal = Calendar.getInstance(); 
		  cal.setTime(inDate); 
		  int week = cal.DAY_OF_WEEK;
		  
		  if (week == 1) { 
			  System.out.println("�Է��Ͻ� ��¥�� �Ͽ����Դϴ�."); 
		  } 
		  else if (week == 2) { 
			  System.out.println("�Է��Ͻ� ��¥�� �������Դϴ�."); 
		  } 
		  else if (week == 3) {
			  System.out.println("�Է��Ͻ� ��¥�� ȭ�����Դϴ�."); 
		  } 
		  else if (week == 4) {
			  System.out.println("�Է��Ͻ� ��¥�� �������Դϴ�."); 
		  } 
		  else if (week == 5) {
			  System.out.println("�Է��Ͻ� ��¥�� ������Դϴ�."); 
		  } 
		  else if (week == 6) {
			  System.out.println("�Է��Ͻ� ��¥�� �ݿ����Դϴ�."); 
		  } 
		  else if (week == 7) {
			  System.out.println("�Է��Ͻ� ��¥�� ������Դϴ�."); 
		  }
		 
		
		
		  //������ ���� ������ ���س��� ����� �� ����
		  //String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�."; //E�� ��~���� �ϳ�
		  //DateFormat df2 = new SimpleDateFormat(pattern2); 
		  //System.out.println(df2.format(inDate));
		 
	}

}
