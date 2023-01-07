package daily.string;

public class Exploring_toString_Method {
	
	
	@Override
	public String toString() {
		return "this is an object of exploring class";
	}

	public static void main(String[] args) {
		int a = 10;
		Exploring_toString_Method ex = new Exploring_toString_Method();
		System.out.println(a);
		System.out.println(ex);
	}
}
