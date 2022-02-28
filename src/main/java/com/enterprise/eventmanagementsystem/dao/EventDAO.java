package com.enterprise.eventmanagementsystem.dao;
import com.enterprise.eventmanagementsystem.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.Map;

/**
 * This dao allows access and maps many of the various functions such as specifically
 * fetching events by their id's.
 * @author Ali Ibrahim, Benjamin Gomori, Kevin Zhu, and Son Bo
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