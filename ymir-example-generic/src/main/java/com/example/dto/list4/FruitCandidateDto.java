package com.example.dto.list4;

public class FruitCandidateDto extends FruitCandidateDtoBase {
    private static final long serialVersionUID = 1L;

    public FruitCandidateDto() {
        getFruitCountSelector().setCandidates(
                new FruitCountCandidateDto("1つ", 1),
                new FruitCountCandidateDto("2つ", 2),
                new FruitCountCandidateDto("3つ", 3));
    }
}
