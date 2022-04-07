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
		if (input < 0) {
			return ERRORCODE.NEGATIVE_NUMBER.toString();
		}

		try {
			return new NumberMapperFactory().createNumberMapper(toType).map(input);
		} catch (IllegalArgumentException e){
			return ERRORCODE.UNKNOWN_TARGET.toString();
		}
	
	}
}