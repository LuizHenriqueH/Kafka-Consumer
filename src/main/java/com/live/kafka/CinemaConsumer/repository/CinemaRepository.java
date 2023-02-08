package com.live.kafka.CinemaConsumer.repository;

import com.live.kafka.CinemaConsumer.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, String> {
}
