package com.practice.string;

import java.util.Arrays;

public class ReverseStringOnlyEngchars {

	public static void main(String[] args) {

		ReverseStringOnlyEngchars obj = new ReverseStringOnlyEngchars();

		System.out.println(obj.reverseOnlyLetters("ab-cd"));
		System.out.println(obj.reverseOnlyLetters("a-bC-dEf-ghIj"));
		System.out.println(obj.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}

	public String reverseOnlyLetters(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		char[] charArr = s.toCharArray();

		int i = 0;
		int j = charArr.length - 1;

		while (i < j) {

			if (!isCharacter(charArr[i])) {
				i++;
				continue;
			}
			if (!isCharacter(charArr[j])) {
				j--;
				continue;
			}

			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;

			i++;
			j--;
		}
		return String.valueOf(charArr);
	}

	private boolean isCharacter(char c) {

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return true;
		}

		return false;
	}

}
