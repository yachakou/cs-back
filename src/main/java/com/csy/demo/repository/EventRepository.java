package com.csy.demo.repository;

import com.csy.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EventRepository extends JpaRepository<Event,String> {
}
