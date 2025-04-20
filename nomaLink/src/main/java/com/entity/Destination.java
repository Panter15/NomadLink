package com.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "destination" )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    public Destination(String name, String country, String description, String imageUrl) {
        this.name = name;
        this.country = country;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Destination(){}

}
