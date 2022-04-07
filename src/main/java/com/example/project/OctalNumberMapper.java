package com.example.project;

public class OctalNumberMapper implements GenericNumberMapper {

    public String map(int value) {
        return BaseNumberMapper.mapToBase(value, 8);
    }
}