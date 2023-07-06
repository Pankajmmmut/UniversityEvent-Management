package com.assignment.UniversityEventManagement.service;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;
    public String addEvent(Event event) {
        eventRepo.save(event);
        return "an event added.";
    }

    public Iterable getAllEvents() {
        return eventRepo.findAll();
    }

    public String deleteEventbyId(Integer eventId) {
        eventRepo.deleteById(eventId);
        return " event deleted";
    }
}
