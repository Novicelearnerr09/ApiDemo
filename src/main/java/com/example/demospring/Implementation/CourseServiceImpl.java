package com.example.demospring.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demospring.Dao.CourseDao;
import com.example.demospring.Entities.Course;
import com.example.demospring.Service.CourseService;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    @Autowired
    CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
        return courseDao.getById(courseId);

    }

    @Override
    public Course addCourse(Course course) {
     return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
       // courseDao.getById(course.);
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
      
        Course c = courseDao.getById(courseId);
      courseDao.delete(c);
    }

    

    

    
    
}





