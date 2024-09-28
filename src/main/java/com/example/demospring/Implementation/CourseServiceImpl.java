package com.example.demospring.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demospring.Entities.Course;
import com.example.demospring.Service.CourseService;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(1,"java", "java edition"));
        list.add(new Course(2, "Spring", "Spring edition"));
    }

    @Override
    public List<Course> getCourses() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getCourse'");
       System.out.println("implementation");
       return list;
    }

    @Override
    public Course getCourse(Long courseId) {
        Course c = null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCourse'");

        for(Course course : list)
        {
            if(course.getId() == courseId)
            {
                c=course;
                break;
            }
        
        }

       // System.out.println("impl - services 1");
        return c;
    }


    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

        list.forEach(e -> {
            if(e.getId()==course.getId())
            {
                e.setId(course.getId());
                e.setName(course.getName());
                e.setTitle(course.getTitle());
            }
        });
        
        return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
        
        list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
         
       }




   




    

    
    
}





