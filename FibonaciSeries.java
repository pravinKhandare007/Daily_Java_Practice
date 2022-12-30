package daily.misselenious;

public class FibonaciSeries {
	public void fibo(int n) {
		
		int count=0;
		int a=0;
		int b=1;
		while(count != n) {
			System.out.print(a);
			System.out.print(" ");
			int c = a;
			a=b;
			b=c+b;
			count++;
		}
	}
	
	public static void main(String[] args) {
		FibonaciSeries fb = new FibonaciSeries();
		int k = 10;
		fb.fibo(k);
	}
}
