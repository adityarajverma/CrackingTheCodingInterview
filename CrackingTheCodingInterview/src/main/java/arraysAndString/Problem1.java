package arraysAndString;

import java.util.Arrays;

/**
 * Find Uniqueness of String
 * 
 * @author vermaa30
 *
 */
public class Problem1 {

	public static void main(String args[]) {
		String str = "ABDITYA";
		Boolean[] flag = new Boolean[128];
		Arrays.fill(flag, Boolean.FALSE);
		int length = str.length();

		char a[] = str.toCharArray();
		for (int i = 0; i < length; i++) {
			int b = a[i];

			if (flag[b] == true) {
				System.out.println("Not unique");
				System.exit(0);
			} else {
				flag[b] = true;
			}

		}

		System.out.println("This is Unique");
	}

}
