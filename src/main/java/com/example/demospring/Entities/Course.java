package com.example.demospring.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties
@Getter
@Setter
@Entity
public class Course {

    @Id
    private Long id;
    private String name;
    private String title;

    public Course(long id, String name, String title)
    {
        super();
        this.id=id;
        this.name=name;
        this.title=title;
    }

    public Course()
    {
        super();
    }

}
