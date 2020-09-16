package arraysAndString;

/**
 * Given two string is permutation of other
 * 
 * @author vermaa30
 *
 */
public class Problem2 {

	public static void main(String args[]) {

		String s1 = "abcdg";
		String s2 = "bacde";
		char a1[] = s1.toCharArray();
		char a2[] = s2.toCharArray();

		if (s1.length() != s2.length()) {
			System.out.println("THis is not permutation");
			return;

		}

		else {
			int count1 = 0;
			int count2 = 0;
			for (int i = 0; i < s1.length(); i++) {
				int n1 = a1[i];
				int n2 = a2[i];
				count1 = count1 + n1;
				count2 = count2 + n2;

			}

			if (count1 == count2) {
				System.out.println(s1 + " is permutation of " + s2);
			} else {
				System.out.println(s1 + " is not permutation of " + s2);
			}
		}

	}

}
