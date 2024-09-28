package com.example.demospring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demospring.Entities.Course;
import com.example.demospring.Service.CourseService;

@RestController
public class courseController {



    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String call()
    {
        return "Welcome to Application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
       return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getcourse(@PathVariable String courseId)
    {

        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }
    

    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
    {
        try{
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    
}
