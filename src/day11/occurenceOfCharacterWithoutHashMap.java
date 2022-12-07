package day11;


/*
 * declare an array size of 256
 * traverse through each char array
 * Create an array of given String size
 * traverse through if any matches found increment the index
 * if found print the occurences.
 */
public class occurenceOfCharacterWithoutHashMap {
	   public static void main(String[] args) {
		   String str = "thanveer";
			// Create an array of size 256
			// i.e. ASCII_SIZE
			int count[] = new int[256];

			int len = str.length();

			// Initialize count array index
			for (int i = 0; i < len; i++)
				count[str.charAt(i)]++;

			// Create an array of given String size
			char ch[] = new char[str.length()];
			for (int i = 0; i < len; i++) {
				ch[i] = str.charAt(i);
				int find = 0;
				for (int j = 0; j <= i; j++) {
			// If any matches found
					if (str.charAt(i) == ch[j])
						find++;
				}
				if (find == 1)
	System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
			}
		 
	   }
	}
