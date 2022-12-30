package anagramAndFibonicci;
public class Fibonacci {

	public static void main(String[] args) {
		
		    int a = 0;
		    int b = 1;

		    for (int i = 1; i <= 10; i++) {
		        System.out.print(a + " ");
		        a = a + b;
		        b = a - b;
		    } 

		   // System.out.println();

	}

}
