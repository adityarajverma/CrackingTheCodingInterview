package arraysAndString;

import java.util.HashMap;

public class Problem6 {

	public static void main(String args[]) {
		String str = "aabcccccaaa";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char a[] = str.toCharArray();
		int count = 0;
		Character temp = null;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			temp = a[i];
			count++;

			if (i == str.length() - 1) {
				result = result + temp + String.valueOf(count);

			} else if (a[i] != a[i + 1]) {

				result = result + temp + String.valueOf(count);
				count = 0;
			}

		}
		System.out.println(result);
	}
}
