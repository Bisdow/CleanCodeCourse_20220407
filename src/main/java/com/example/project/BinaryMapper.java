package com.example.project;

public class BinaryMapper implements GenericNumberMapper {

    public String map(int value) {
        return BaseNumberMapper.mapToBase(value, 2);
    }
}