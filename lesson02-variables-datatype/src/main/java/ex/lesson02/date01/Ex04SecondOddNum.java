package ex.lesson02.date01;

import java.util.Arrays;

public class Ex04SecondOddNum {
	public static void main(String[] args) {
		int[] arrNum = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		Arrays.parallelSort(arrNum, 0, arrNum.length);
		int num = 0;
		System.out.print("Số lẻ lớn thứ hai của dãy: ");

		for (int i = arrNum.length - 1; i >= 0; i--) {
			if (arrNum[i] % 2 != 0) {
				if (num != 0) {
					System.out.println(arrNum[i]);
					break;
				}
				num = arrNum[i];
			}
		}
	}
}
