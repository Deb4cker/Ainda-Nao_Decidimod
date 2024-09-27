package com.pmnato.fortus.entity;

import com.pmnato.fortus._enum.Difficulty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Exercise {

    private long id;

    private String name;

    private Difficulty difficultyLevel;

    private int repetitions;

    private String suggestedTime;

    private String imageUrl;

    private String VideoUrl;

    //private long equipmentId;
    //private long categoryId;
}