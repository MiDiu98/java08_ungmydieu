package java08.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		// A(xA, yA)
		// R = 5, O(xO, yO)
		// kiem tra vi tri cua A so voi duong tron
		// String trong, tren, ngoai

		Point A = new Point(3, 4);
		Point O = new Point(0, 0);

		int R = 5;
		CirclePosition pos = getPointStatusWithCircle(A, O, R);
		System.out.println("Result: " + pos.value);
	}

	public static CirclePosition getPointStatusWithCircle(Point A, Point O, int R) {
		double distance = Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
		return (distance == R) ? CirclePosition.ONSIDE
				: (distance > R) ? CirclePosition.OUTSIZE : CirclePosition.INSIDE;

	}
}
