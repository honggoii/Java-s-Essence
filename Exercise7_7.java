package default1;

class Outer {
	static class Inner {
		int iv = 200;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in = new Outer.Inner();
		System.out.println(in.iv);
	}
}
