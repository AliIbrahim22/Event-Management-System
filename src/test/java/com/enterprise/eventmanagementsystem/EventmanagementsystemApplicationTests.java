package com.enterprise.eventmanagementsystem;
import com.enterprise.eventmanagementsystem.dao.EventRepository;
import com.enterprise.eventmanagementsystem.dto.Event;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

import java.text.ParseException;

@SpringBootTest
class EventManagementSystemApplicationTests {

    @MockBean
    private Event event= new Event();
    @MockBean
    private EventRepository eventRepository;

    @Test
    void addNewEvent_displayNewEvent()throws ParseException {
        thenAddNewEvent();
    }

    private void thenAddNewEvent() {
        Event createEvent = eventRepository.save(event);
        assertEquals(event, createEvent);
        verify(eventRepository, atLeastOnce()).save(event);
    }
    @Test
    void saveEvent_displayEventUpdate()throws ParseException {
        thenEventUpdates();
    }

    private void thenEventUpdates() {
        eventRepository.save(event);
        var updateEvent = eventRepository.findById(event.getId());
        assertEquals(event, updateEvent);
        verify(eventRepository, atLeastOnce()).save(event);
    }
}
