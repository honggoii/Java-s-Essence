class Outer {
	class Inner {
		int iv = 100;
	}
}
public class Exercise7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
		
		System.out.println(inner.iv);
	}

}
