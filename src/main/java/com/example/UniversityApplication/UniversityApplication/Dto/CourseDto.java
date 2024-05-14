package com.example.UniversityApplication.UniversityApplication.Dto;

import com.example.UniversityApplication.UniversityApplication.Class.Course;

import java.io.Serializable;

public class CourseDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private String instructor;

    public void getId() {
        this.id = id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor( String instructor ) {
        this.instructor = instructor;
    }
}
