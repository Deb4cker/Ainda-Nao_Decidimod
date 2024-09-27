package com.pmnato.fortus.controller;

import com.pmnato.fortus._enum.DayOfWeek;
import com.pmnato.fortus.entity.Training;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
@RestController
public class TrainingController {
    @GetMapping("/training/all")
    public Training[] getAll(){
        return new Training[]{
                new Training(1L, "Peito", LocalDate.of(2024, Month.JANUARY, 1), true, 1, DayOfWeek.MONDAY),
                new Training(2L, "Costas e biceps", LocalDate.of(2024, Month.FEBRUARY, 15), true, 1, DayOfWeek.FRIDAY),
                new Training(3L, "Perna", LocalDate.of(2024, Month.MARCH, 22), true, 1, DayOfWeek.THURSDAY),
                new Training(4L, "Ombro", LocalDate.of(2024, Month.DECEMBER, 9), false, 1, DayOfWeek.TUESDAY),
                new Training(5L, "Biceps", LocalDate.of(2024, Month.JANUARY, 9), false, 1, DayOfWeek.MONDAY),
                new Training(6L, "Triceps", LocalDate.of(2024, Month.JULY, 29), true, 1, DayOfWeek.SATURDAY),
                new Training(7L, "Peito", LocalDate.of(2024, Month.SEPTEMBER, 17), true, 1, DayOfWeek.SUNDAY),
                new Training(8L, "Braço", LocalDate.of(2024, Month.MAY, 19), true, 1, DayOfWeek.MONDAY),
                new Training(9L, "Abdomen", LocalDate.of(2024, Month.AUGUST, 15), true, 1, DayOfWeek.WEDNESDAY),
                new Training(10L, "Costas", LocalDate.of(2024, Month.FEBRUARY, 13), true, 1, DayOfWeek.FRIDAY)
        };
    }
}
