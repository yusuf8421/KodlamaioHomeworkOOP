package com.company;

public class CourseManager {
    public  void registerCourse(Course course)
    {
        System.out.println(course.courseName +"Kaydınız başarılı bir şekilde yapıldı");
    }

    public  void  listCourse(Course[] courses)
    {
        for(Course course:courses)
        {
            System.out.println(course.courseName +" "+ course.courseDetail +""+ course.teacher +""+ course.courseRemaingPercentage);
        }
    }
}
