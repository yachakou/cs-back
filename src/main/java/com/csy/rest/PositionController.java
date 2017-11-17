package com.csy.rest;

import com.csy.entity.Position;
import com.csy.model.PositionModel;
import com.csy.service.PositionService;
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
