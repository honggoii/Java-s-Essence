import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Calendar birth = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		birth.set(1997, 2, 22);
		today.set(2020, 7, 3);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			
		System.out.println("birth day = " + sf.format(new Date(birth.getTimeInMillis())));
		System.out.println("today = " + sf.format(new Date(today.getTimeInMillis())));
		
		long diff = (today.getTimeInMillis() - birth.getTimeInMillis()) / 1000;
		
		System.out.println((diff/(24*60*60)) + "days");
	}

}
