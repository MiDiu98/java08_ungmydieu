package java08.datatype;

public class Ex05ObjectEx02 {
	public static void main(String[] args) {
		Int x = new Int(88);
		Int y = new Int(44);		
		swap(x,y);
		
		// có bao nhiêu cách tạo đối tượng trong java
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
	private static void swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}

class Int {
	public int value;
	
	public Int(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return ""+value;
		//return super.toString();
	}
}
