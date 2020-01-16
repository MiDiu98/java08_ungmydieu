package ex.lesson02.date01;

public class Ex05Radix {
	public static void main(String[] args) {
		int x = 6;

		String str = "";
		while (x > 0) {
			str += x % 2;
			x /= 2;
		}
		str = new StringBuffer(str).reverse().toString();
		System.out.println("Đổi số ở hệ cơ số 10 sang hệ cơ số 2 là: " + str);
	}
}
