package arraysAndString;

import java.util.Arrays;

public class Problem5 {

	public static void main(String args[]) {
		String s1 = "pale";
		String s2 = "bake";
		char a1[] = s1.toCharArray();
		char a2[] = s2.toCharArray();
		int diff = 0;

		for (int i = 0; i < s2.length(); i++) {
			Arrays.sort(a1);

			if (Arrays.binarySearch(a1, a2[i]) > 0) {

			} else {
				diff++;
			}
		}

		if (diff > 1) {
			System.out.println("False");
		}

		else {
			System.out.println("True");
		}
	}

}
