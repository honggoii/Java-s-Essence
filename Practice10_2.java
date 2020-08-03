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
			System.out.println("날짜를  " + pattern + "의 형태로 입력해주세요.(입력예:2017/05/11)");
			try {
				inDate = df.parse(s.nextLine()); //입력 받은 날짜를 Date로 변환
				break; //parse에서 pattern대로 입력하면 실행
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2017/05/11)");
			}
		} while(s.hasNextLine());
		
		
		  Calendar cal = Calendar.getInstance(); 
		  cal.setTime(inDate); 
		  int week = cal.DAY_OF_WEEK;
		  
		  if (week == 1) { 
			  System.out.println("입력하신 날짜는 일요일입니다."); 
		  } 
		  else if (week == 2) { 
			  System.out.println("입력하신 날짜는 월요일입니다."); 
		  } 
		  else if (week == 3) {
			  System.out.println("입력하신 날짜는 화요일입니다."); 
		  } 
		  else if (week == 4) {
			  System.out.println("입력하신 날짜는 수요일입니다."); 
		  } 
		  else if (week == 5) {
			  System.out.println("입력하신 날짜는 목요일입니다."); 
		  } 
		  else if (week == 6) {
			  System.out.println("입력하신 날짜는 금요일입니다."); 
		  } 
		  else if (week == 7) {
			  System.out.println("입력하신 날짜는 토요일입니다."); 
		  }
		 
		
		
		  //다음과 같이 패턴을 정해놓고 출력할 수 있음
		  //String pattern2 = "입력하신 날짜는 E요일입니다."; //E는 일~토중 하나
		  //DateFormat df2 = new SimpleDateFormat(pattern2); 
		  //System.out.println(df2.format(inDate));
		 
	}

}
