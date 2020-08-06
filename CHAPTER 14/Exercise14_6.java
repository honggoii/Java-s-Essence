import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		Stream<String> strStrm = Stream.of(strArr);
		
		strStrm.map(String::length)
		.sorted(Comparator.reverseOrder())
		.limit(1).forEach(System.out::println);
	}	
	
}
