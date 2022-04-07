package com.example.project;

public class BinaryNumberMapper implements GenericNumberMapper {

    public String map(int value) {
        return BaseNumberMapper.mapToBase(value, 2);
    }
}