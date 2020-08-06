import java.util.stream.Stream;

public class Ex14_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		Stream<String> strStrm = Stream.of(strArr);
		
		int sum = strStrm.mapToInt(String::length).sum();
		System.out.println("sum=" + sum);
	}	
	
}
