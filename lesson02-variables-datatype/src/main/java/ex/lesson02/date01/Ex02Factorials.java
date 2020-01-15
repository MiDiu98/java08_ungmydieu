package ex.lesson02.date01;

public class Ex02Factorials {
	public static void main(String[] args) {
		long s = factorials(4) + factorials(7) + factorials(12) + factorials(18);
		System.out.println(s);
	}

	public static long factorials(int num) {
		if (num == 1)
			return 1;
		else
			return num * factorials(num - 1);
	}
}
