package operator;

public class Ex01 {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(n++);
		System.out.println(n++);
		System.out.println(n); // 9

		boolean type = n % 2 == 0;
		if (!type) System.out.println("Số lẻ");
		System.out.println("Số chẵn");
	}
}
