package com.csy.demo.repository;

import com.csy.demo.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ProfileRepository extends JpaRepository<Profile, String> {
}
