
public class Exercise9_3 {
	public static int count(String src, String target) {
		int count = 0; //찾은 횟수
		int pos = 0; //시작할 위치
				
		while(true) {
			int idx = src.indexOf(target, pos);
			if (idx == -1)
				break;
			else {
				count++;
				pos = idx + target.length();
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}

}
