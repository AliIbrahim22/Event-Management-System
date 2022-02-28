package com.enterprise.eventmanagementsystem.dao;
import com.enterprise.eventmanagementsystem.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.Map;

/**
 * I would comment here like your other pages that describes the purpose.
 * This dao allows access and maps many of the various functions such as specifically
 * fetching events by their id's.
 */
public class EventDAO implements IEventDAO {

    Map<Integer, Event> allEvents = new HashMap<>();

    @Autowired
    @Qualifier("eventRepository")
    EventRepository eventRepository;

    @Override
    public Event fetch(int eventId) {
        return eventRepository.findById(eventId).get();
    }

    @Override
    public Iterable<Event> fetchAll() throws Exception {
        return eventRepository.findAll();
    }

    @Override
    public Event save(Event event) throws Exception {
        return eventRepository.save(event);
    }
}