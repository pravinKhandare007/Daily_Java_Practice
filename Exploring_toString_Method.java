package daily.string;

class Gg{
	int g;

	@Override
	public String toString() {
		return "Gg [g=" + g + "]";
	}
}


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
		
		String st = "what will the st return in sysout";
		System.out.println(st);
		char[] ch = {'a','b','b'};
		
		String st2 = new String(ch);
		System.out.println(st2);
		
		Gg g= new Gg();
		System.out.println(g);
	}
}
