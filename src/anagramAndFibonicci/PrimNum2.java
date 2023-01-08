package anagramAndFibonicci;

public class PrimNum2 {

	public static void main(String[] args) {
		int primeCheckNumber;
		int n = 1;
		int Count;

		while (n <= 100) {
			Count = 0;
			primeCheckNumber = 2;
			while (primeCheckNumber <= n / 2) {
				if (n % primeCheckNumber == 0) {
					Count++;
					break;
				}
				primeCheckNumber++;
			}
			if (Count == 0 && n != 1) {
				System.out.print(n + " ");
			}
			n++;
		}

	}

}
