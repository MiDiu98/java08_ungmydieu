package ex.lesson02.date01;

public class Ex01SortThreeNum {
	public static void main(String[] args) {
		Integer a = new Integer(7);
		Integer b = new Integer(3);
		Integer c = new Integer(9);

		if (compareNum(a, b) == 1)
			swap(a, b);
		if (compareNum(b, c) == 1)
			swap(b, c);
		if (compareNum(a, c) == 1)
			swap(c, a);

		System.out.println("Sap xep tang dan:");
		System.out.println(a + "  " + b + "  " + c);
	}

	public static void swap(Integer a, Integer b) {
		int tmp;
		tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}

	public static byte compareNum(Integer a, Integer b) {
		if (a.value > b.value)
			return 1;
		else if (a.value == b.value)
			return 0;
		return -1;

	}
}

class Integer {
	int value;

	public Integer(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;
	}
}