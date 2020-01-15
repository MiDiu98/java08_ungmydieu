package ex.lesson02.date01;

import java.util.Random;

public class Ex07randNum {
	public static void main(String[] args) {
		final int LENGTH = 5;
		Random rd = new Random();
		int[] a = new int[LENGTH];
		int pos = 0;

		System.out.println("Dãy 5 số ngẫu nhiên không trùng lặp: ");
		while (pos < a.length) {
			int num = 20 + rd.nextInt(11);
			if (!notDuplicate(a, pos, num))
				continue;
			a[pos] = num;
			System.out.print(a[pos] + "    ");
			pos++;
		}

	}

	public static boolean notDuplicate(int[] a, int pos, int num) {
		for (int i = 0; i < pos; i++) {
			if (a[i] == num)
				return false;
		}
		return true;
	}
}
