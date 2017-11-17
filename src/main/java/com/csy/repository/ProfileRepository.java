package com.csy.repository;

import com.csy.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ProfileRepository extends JpaRepository<Profile, String> {
}
