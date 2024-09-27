package com.pmnato.fortus.controller;

import com.pmnato.fortus._enum.Difficulty;
import com.pmnato.fortus.entity.Exercise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    @GetMapping
    public Exercise[] getall(){
        return new Exercise[]{
                new Exercise(1, "Supino reto", Difficulty.MEDIUM, 12, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(2, "Agachamento Hack", Difficulty.HARD, 8, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(3, "Rosca alternada Halteres", Difficulty.EASY, 12, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(4, "Agachamento bulgaro", Difficulty.HARD, 6, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(5, "Puxada alta", Difficulty.MEDIUM, 12, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(6, "Crucifixo maquina", Difficulty.EASY, 15, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(7, "MuscleUp", Difficulty.HARD, 4, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(8, "Flexao", Difficulty.EASY, 12, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(9, "Remada curvada", Difficulty.HARD, 8, "1:30", "ImageUrl", "VideoUrl"),
                new Exercise(10, "Supino inclinado com halteres", Difficulty.MEDIUM, 12, "1:30", "ImageUrl", "VideoUrl")

        };
    }
}
