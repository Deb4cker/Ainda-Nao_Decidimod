package com.pmnato.fortus.entity;

import com.pmnato.fortus._enum.DayOfWeek;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Training {
    private long id;
    private String description;
    private LocalDate date;
    private boolean status;
    private long durationTimeMilis;
    private DayOfWeek dayOfWeek;
    private long userId;

    //private User user;

}
