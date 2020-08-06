import java.util.Random;

public class Ex11_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random().ints(1, 46)
		.distinct()
		.limit(6)
		.sorted()
		.forEach(System.out::println);
	}	
	
}
