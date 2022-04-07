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
		return new NumberMapperFactory().createNumberMapper(toType).map(input);
	}

	private boolean isTypeUnknown(String toType) {
		return !NumberType.contains(toType);
	}

}