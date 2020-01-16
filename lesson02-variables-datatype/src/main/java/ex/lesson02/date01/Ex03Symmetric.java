package ex.lesson02.date01;

import java.util.Scanner;

public class Ex03Symmetric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so can kiem tra:");
		int s = sc.nextInt();
		int checkNum = 0;
		int tmp = s;
		while (tmp > 0) {
			checkNum = checkNum * 10 + tmp % 10;
			tmp /= 10;
		}
		if (checkNum == s)
			System.out.println(s + " la so doi xung.");
		else
			System.out.println(s + " khong la so doi xung.");
		sc.close();
	}
}
