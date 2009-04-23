package com.example.dto.list4;

public class FruitCountCandidateDto extends FruitCountCandidateDtoBase {
    private static final long serialVersionUID = 1L;

    public FruitCountCandidateDto() {
    }

    public FruitCountCandidateDto(String label, Integer value) {
        setLabel(label);
        setValue(value.toString());
    }

    public Integer getValueAsInteger() {
        try {
            return Integer.parseInt(getValue());
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
