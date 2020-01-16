package ex.lesson02.date01;

public class Ex06Prime {
	public static void main(String[] args) {
		final int POS = 5;
		int count = 0;
		int num = 1;
		while (count < POS) {
			++num;
			if (prime(num))
				count++;
		}
		System.out.println("Số nguyên tố thứ " + POS + ": " + num);
	}

	public static boolean prime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
