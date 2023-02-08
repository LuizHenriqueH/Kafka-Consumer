package com.live.kafka.CinemaConsumer.service;

import com.live.kafka.CinemaConsumer.dto.CinemaDTO;
import com.live.kafka.CinemaConsumer.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CinemaService {

    @Autowired
    CinemaRepository repository;

    public void save(CinemaDTO cinemaDTO){
        repository.save(cinemaDTO.toEntity());

    }

}
