package com.example.codeclan.capstoneproject.Campagna.models.events;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {

    Event event;

    @BeforeEach
    public void before(){
        event = new Event("Xmas", "A short description of that unknown holiday", LocalDate.of(2022, 12, 24), LocalDate.of(2022, 12, 26));
    }

    @Test
    public void eventHasName() {
        assertEquals("Xmas", event.getEventName());
    }

    @Test
    public void eventHasDescription() {
        assertEquals("A short description of that unknown holiday", event.getEventDescription());
    }

    @Test
    public void eventHasStartDate() {
        assertEquals(LocalDate.of(2022, 12, 24), event.getStartDate());
    }

    @Test
    public void eventHasEndDate() {
        assertEquals(LocalDate.of(2022, 12, 26), event.getEndDate());
    }
}
