package arraysAndString;

import java.util.HashMap;

/**
 * Find if string is permutation of palindrome
 * 
 * @author vermaa30
 *
 */
public class Problem4 {

	public static void main(String args[]) {

		String str = "Tact Coa";
		str = str.toLowerCase().replace(" ", "");

		char a[] = str.toCharArray();

		int oddCount = 0;

		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (countMap.get(a[i]) != null) {
				countMap.put(a[i], countMap.get(a[i]) + 1);

			}

			else {
				countMap.put(a[i], 1);
			}

		}

		System.out.println(countMap);

		for (int i = 0; i < str.length(); i++) {
			if (countMap.get(a[i]) % 2 != 0) {
				oddCount++;
			}

		}

		if (oddCount > 1) {
			System.out.println("This is not permutation of Palindrome");
		} else {
			System.out.println("This is a permutation of Palindrome");
		}

	}

}
