package com.example.project;

public class HexaDecimalNumberMapper {

    	static String mapToHexaDecimal(int input) {
		if (input == 0) {
			return "0";
		}

		int number = input;
		String result = "";

		int counter = 0;
		int rest = input;

		while (rest > 0) {
			rest = rest / 16;
			counter++;
		}
		counter--;

		for (; counter >= 0; counter--) {
			int helperValue = number % 16;
			if (helperValue == 10) {
				result = result.concat("A");
			} else if (helperValue == 11) {
				result = result.concat("B");
			} else if (helperValue == 12) {
				result = result.concat("C");
			} else if (helperValue == 13) {
				result = result.concat("D");
			} else if (helperValue == 14) {
				result = result.concat("E");
			} else if (helperValue == 15) {
				result = result.concat("F");
			} else {
				result = Integer.toString(helperValue).concat(result);
			}
			number = number / 16;
		}
		return result;
	}
}