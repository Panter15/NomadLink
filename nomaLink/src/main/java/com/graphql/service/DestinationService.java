package com.graphql.service;

import com.entity.Destination;
import com.respository.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    DestinationRepository destinationRepository;

    DestinationService(DestinationRepository destinationRepository){
        this.destinationRepository = destinationRepository;
    }


    public List<Destination> getAllDestinations(){
        List<Destination> results = destinationRepository.findAll();
        System.out.println("Returning destinations: " + results);
        return results != null ? results : List.of();
    }

}
