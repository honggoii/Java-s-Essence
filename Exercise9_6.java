import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] PhoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println(">>");
			String input = s.nextLine().trim();
			
			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			String pattern = ".*" + input + ",*"; //input�� �����ϴ� ��� ���ڿ�
			Pattern p = Pattern.compile(pattern); //���� ����
			
			for (int i = 0; i < PhoneNumArr.length; i++) {
				String phoneNum = PhoneNumArr[i];
				String tmp = phoneNum.replace("-","");
				
				Matcher m = p.matcher(tmp);
				
				if(m.find()) { //���ϰ� ��ġ�ϸ�
					list.add(phoneNum); //list�� �߰�
				}
			}
			
			if (list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
		}
		
	}

}
