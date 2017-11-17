package com.csy.demo.service;

import com.csy.demo.entity.Event;
import com.csy.demo.mapper.EventMapper;
import com.csy.demo.model.CreateEventBody;
import com.csy.demo.model.VerifyResponse;
import com.csy.demo.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private static final Logger logger = LoggerFactory.getLogger(EventService.class);

    @Autowired
    private EventRepository eventRepository;

    public Event findEvent(String id) {
        logger.info("client {}", id);
        Event result = eventRepository.getOne(id);
        return result;
    }

    public VerifyResponse createEvent(CreateEventBody verifyBody) {
        logger.info("create event");
        Event event = EventMapper.populateEvent(verifyBody);
        Event save = eventRepository.save(event);
        logger.info("id event generated {}", save.getId());
        return VerifyResponse.builder().status("OK").isVerified(true).id(save.getId()).build();
    }

    public List<Event> findAll(){
        logger.info("get all client");
        return eventRepository.findAll();
    }


}
