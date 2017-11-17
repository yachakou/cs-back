package com.csy.demo.repository;

import com.csy.demo.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,String> {
}
