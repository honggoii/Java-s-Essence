import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 1); //2020년 1월 1일로 설정
		
		for (int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			
			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
		
			//날짜를 다음달 1일로 변경
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
	}

}
