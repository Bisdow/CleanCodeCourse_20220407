package com.example.project;

public class NumberMapperFactory {
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
    public GenericNumberMapper createNumberMapper(String toType) {

        if (toType.equalsIgnoreCase(NumberType.Romanian.name())) {
            return new RomanianNumberMapper();
        }
        if (toType.equalsIgnoreCase(NumberType.Binary.name())) {
            return new BinaryNumberMapper();
        }
        if ((toType.equalsIgnoreCase(NumberType.Octal.name()))) {
            return new OctalNumberMapper();
        }
        if (toType.equalsIgnoreCase(NumberType.Hexadecimal.name())) {
            return new HexaDecimalNumberMapper();
        }

       throw new IllegalArgumentException();

    }

}