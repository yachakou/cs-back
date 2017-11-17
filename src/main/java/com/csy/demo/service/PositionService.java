package com.csy.demo.service;

import com.csy.demo.entity.Position;
import com.csy.demo.model.PositionModel;
import com.csy.demo.repository.PositionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {


    private static final Logger logger = LoggerFactory.getLogger(PositionService.class);

    @Autowired
    private PositionRepository positionRepository;


    public Position save(PositionModel model){
        logger.info("save position {}  {}",model.getLongitude(),model.getLatitude());
        Position position = new Position(model.getLongitude(),model.getLatitude(),model.getAdresse());
        Position res = positionRepository.save(position);
        logger.info("saved successful {}",model);

        return res;
    }

    public List<Position> findAll() {
        return this.positionRepository.findAll();
    }
}
