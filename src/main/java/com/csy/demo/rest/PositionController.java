package com.csy.demo.rest;

import com.csy.demo.entity.Position;
import com.csy.demo.model.PositionModel;
import com.csy.demo.service.PositionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PositionController {

    private final PositionService positionService;

    @PostMapping(produces = "application/json", value = "/position")
    @CrossOrigin(origins = "*")
    public Position savePosition(@RequestBody PositionModel model) {
        return positionService.save(model);
    }

    @GetMapping(produces = "application/json", value = "/positions")
    @CrossOrigin(origins = "*")
    public ResponseEntity allPositions() {
        List<Position> response = positionService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
