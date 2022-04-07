package com.example.project;

public class NumberMapper {

	enum NumberType {
		Romanian, Binary, Octal, Hexadecimal;

		public static boolean contains(String type){
			for (NumberType  value: values()) {
				if(value.name().equalsIgnoreCase(type)){
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		NumberMapper mapper = new NumberMapper();
		System.out.println(mapper.mapTo(Integer.parseInt(args[0]), args[1]));
	}

	public String mapTo(int input, String toType) {
		if (isTypeUnknown(toType)) {
			return ERRORCODE.UNKNOWN_TARGET.toString();
		}
		if (input < 0) {
			return ERRORCODE.NEGATIVE_NUMBER.toString();
		}
		if (toType.equalsIgnoreCase(NumberType.Romanian.name())) {
			return new RomanianNumberMapper().map(input);
		}
		if (toType.equalsIgnoreCase(NumberType.Binary.name())) {
			return new BinaryNumberMapper().map(input);
		}
		if ((toType.equalsIgnoreCase(NumberType.Octal.name()))) {
			return new OctalNumberMapper().map(input);
		}
		if (toType.equalsIgnoreCase(NumberType.Hexadecimal.name())) {
			return new HexaDecimalNumberMapper().map(input);
		}
		return ERRORCODE.UNEXPECTED_ERROR.toString();
	}

	private boolean isTypeUnknown(String toType) {
		return !NumberType.contains(toType);
	}
}