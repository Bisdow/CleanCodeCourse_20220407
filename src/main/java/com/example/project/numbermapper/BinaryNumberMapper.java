package com.example.project.numbermapper;

public class BinaryNumberMapper implements GenericNumberMapper {

    public String map(int value) {
        return BaseNumberMapper.mapToBase(value, 2);
    }
}