package java08.datatype;

public class Ex04ObjectEx {
	int c;
	public static void main(String[] args) {
		/*
		 * char c = '5'; System.out.println("isDigit: "+ isDigit(c));
		 * System.out.println("isDigit: "+ Character.isDigit(c));
		 */

		Integer a = new Integer(10);
		System.out.println("a: " + a);
		System.out.println("a1 system hashcode: " + System.identityHashCode(a));
		modified(a);
		System.out.println("a: " + a);
		System.out.println("a1 system hashcode: " + System.identityHashCode(a));
		
		System.out.println("======================");
		
		/*
		 * Integer x = new Integer(17); Integer y = new Integer(22); swap(x,y);
		 * System.out.println("x = " + x); System.out.println("y = " + y);
		 */
	}

	private static void modified(Integer x) {
		System.out.println("x1 system hashcode: " + System.identityHashCode(x));
		x = 20;
		System.out.println("x2 system hashcode: " + System.identityHashCode(x));
	}

	private static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}

	@SuppressWarnings("unused")
	private static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}
}
