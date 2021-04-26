package com.company;

public class Course {
    Course(int courseId,String courseName,String courseDetail,String teacher,Double courseRemaingPercentage){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseDetail=courseDetail;
        this.courseRemaingPercentage=courseRemaingPercentage;
    }
    int courseId;
    String courseName;
    String courseDetail;
    String teacher;
    double courseRemaingPercentage;

}
