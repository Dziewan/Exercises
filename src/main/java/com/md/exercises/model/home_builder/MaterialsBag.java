package com.md.exercises.model.home_builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MaterialsBag {
    private Integer woodAmount;
    private Integer glassAmount;
}
