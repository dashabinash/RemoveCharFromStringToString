package com.dash.abinash.RemoveCharFromStringToString;

/*
 * http://www.geeksforgeeks.org/remove-characters-from-the-first-string-which-are-present-in-the-second-string/
 */
public class CharRemovalFromOneStringToOtherString {

	public static void main(String a[]) {
		String input1 = "geeks for geeks";
		String input2 = "gee";
		CharRemovalFromOneStringToOtherString obj = new CharRemovalFromOneStringToOtherString();
		obj.RemoveCharsFromString(input1, input2);
	}

	public void RemoveCharsFromString(String input1, String input2) {

		char[] input1char = input1.toCharArray();
		String output = " ";

		for (int i = 0; i < input1char.length; i++) {
			String value = String.valueOf(input1char[i]);
			if (value.equals(" ")) {
				continue;
			} else {
				if (!input2.contains(value)) {
					output = output + value;
				}
			}

		}
		System.out
				.println("Output after removal of duplicates elements from first String by comparing to second String:"
						+ output);
	}
}
