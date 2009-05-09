package com.example.dto.checkbox;

public class FruitCandidateDto extends FruitCandidateDtoBase {
    private static final long serialVersionUID = 1L;

    public FruitCandidateDto() {
    }

    public FruitCandidateDto(String value, String name) {
        setValue(value);
        setName(name);
    }
}
