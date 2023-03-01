package com.md.exercises.model.home_builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Home {
    private Integer walls;
    private Integer windows;
}
