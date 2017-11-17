package com.csy.demo.rest;

import com.csy.demo.entity.Event;
import com.csy.demo.model.CreateEventBody;
import com.csy.demo.model.VerifyResponse;
import com.csy.demo.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/event")
public class EventRestController {

    private final EventService eventService;


    @GetMapping(produces = "application/json", value = "/id/{id}")
    @CrossOrigin(origins = "*")
    public Event findEvent(@PathVariable("id") String id) {
        return eventService.findEvent(id);
    }


    @PostMapping(produces = "application/json", value = "/register")
    @CrossOrigin(origins = "*")
    public ResponseEntity createEvent(@RequestBody CreateEventBody body) {
        VerifyResponse response = eventService.createEvent(body);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(produces = "application/json", value = "/historique")
    @CrossOrigin(origins = "*")
    public ResponseEntity historique() {
        List<Event> response = eventService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
