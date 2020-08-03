
public class Exercise6_17 {

	public static int[] shuffle(int[] arr) {
		
		for (int e : arr) {
			int r = (int)(Math.random()%9)+1;
			int temp = arr[e];
			arr[e] = arr[r];
			arr[r] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
