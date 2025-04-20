package com.graphql.resolver;

import com.entity.Destination;
import com.graphql.service.DestinationService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DestinationResolver {
    private final DestinationService service;

    public DestinationResolver(DestinationService service){
        this.service = service;
    }

    @QueryMapping
    public List<Destination> allDestinations(){
        System.out.println("Hello Im in allDestiation REsolver");
        return service.getAllDestinations();
    }
}
