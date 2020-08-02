
public class Exercise9_4 {
	public static boolean contains(String src, String target) {
		int idx = src.indexOf(target);
		if (idx == -1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}

}
