
public class Exercise6_20 {
	public static int max (int[] arr) {
		if (arr==null || arr.length == 0)
			return -999999;

		int check = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > check)
				check = arr[i];
		}
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:" + max(data));
		System.out.println("�ִ밪:" + max(null));
		System.out.println("�ִ밪:" + max(new int[] {}));
	}

}
