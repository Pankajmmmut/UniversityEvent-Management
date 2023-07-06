package com.assignment.UniversityEventManagement.controller;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@Validated
public class EventController {
    @Autowired
    EventService eventService;

    // adding an event
    @PostMapping("event")
    public String addEvent(@Valid @RequestBody Event event){
        return eventService.addEvent(event);
    }

    //get events
    @GetMapping("events")
    public Iterable getAllEvents(){
        return eventService.getAllEvents();
    }

    //delete Event by Id
    @DeleteMapping("event/{eventId}")
    public String deleteEventbyId(@PathVariable Integer eventId){
        return eventService.deleteEventbyId(eventId);
    }


}
