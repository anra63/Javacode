package Practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int num = 10;
		
		for(int i = 0; i <= num; i++ ) {
			int c = a+b;
			a = b; 
			b = c;
			System.out.println(c);
			
		}
		
	}
	}

