package com.example.project;

public class BaseNumberMapper {

	static String mapToBase(int input, int base) {
		int number = input;
		String result = "";

		int counter = 0;
		int rest = input;

		if (input == 0) {
			return "0";
		}

		while (rest > 0) {
			rest = rest / base;
			counter++;
		}
		counter--;

		// create Result
		for (; counter >= 0; counter--) {
			result = Integer.toString(number % base).concat(result);
			number = number / base;
		}
		return result;
	}
}