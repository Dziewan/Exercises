package com.md.exercises.controller;

import java.util.List;
import com.md.exercises.model.home_builder.Home;
import com.md.exercises.service.home_builder.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercises")
@RequiredArgsConstructor
public class ExerciseController {
    private final HomeService homeService;

    @GetMapping("/home-builder")
    public List<Home> buildHomes() {
        return homeService.buildHomes();
    }
}
