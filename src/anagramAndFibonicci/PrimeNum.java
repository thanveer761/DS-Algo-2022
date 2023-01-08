package anagramAndFibonicci;

public class PrimeNum {
	public static boolean isPrimeNumbers(int num) {
		if(num<=1) {
			System.out.println("not prime");
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				System.out.println("not prime");
				return false;
			}
		}
		System.out.println("its prime");
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrimeNumbers(10));
   /*int i, j, k;
   for ( i = 2; i < 100; i++) {
	k=0;
	for ( j = 2;  j<i; j++) {
		if (i%j==0) 
			k=1;
			//continue;
		}
	
		if (k==0) {
			System.out.print(i+" ");
		}
   }}
	*/
}

}