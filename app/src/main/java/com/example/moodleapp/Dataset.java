package com.example.moodleapp;

import java.util.ArrayList;

class User {
    String first_name;
    String last_name;
    String email;
    String userid = "cs1120265";
    String entry_no;
    String password = "12345";
    String registration_key ;
    String reset_password_key;
    String registration_id;
    String type_;
}
class Courses{
    String current_sem;
    String current_year;
    ArrayList<Course> courses = new ArrayList<Course>();
}
class Course{
    public static final String NAME_PREFIX = "Name";
    //public static final String SURNAME_PREFIX ="Credits" ;
    //public static final int NAME_PREFIX = ;
    protected String code;
    protected String name;
    protected String credits;
    protected String description;
    protected String id;
    protected String l_t_p;

   // public static final String NAME_PRIFIX = "Name";
    public static final String CODE_PRIFIX = "Course Code";
    public static final String CREDITS_PRIFIX = "Credits";
    public static final String LTP_PRIFIX = "L_T_P";
}
class Assignmentcourse{
    ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    Course course ;
}
class Assignment{
    String name ;
    String description;
    String deadline;
    String file_ ;
    String late_days_allowed;
    String id;
    String created_at;
}
class Threadcourse{
    ArrayList<Thread> course_threads= new ArrayList<Thread>();
    Course course ;
}
class Thread{
    String title ;
    String description;
    String registered_course_id;
    String user_id ;
    String updated_at;
    String id;
    String created_at;

}
class ThreadDetail{
    Course course;
    Thread thread;
    ArrayList<Threadcomment> comments = new ArrayList<Threadcomment>();
    ArrayList<User> comment_users = new ArrayList<User>();
    ArrayList<String> time_readable = new ArrayList<String>();
}
class Threadcomment{
    String userid;
    String description;
    String created_at;
    String thread_id;
    String id;
}

class GradeCourse{
    ArrayList<Grade> grades= new ArrayList<Grade>();
    Course course ;

}
class Grade{
    String user_id;
    String weightage;
    String name;
    String out_of;
    String registered_course_id;
    String score;
    String id;
}
class AllGrades {
    ArrayList<Course> courses=new ArrayList<Course>();
    ArrayList<Grade> grades= new ArrayList<Grade>();
}
class AssignmentDetail {
    Assignment assignment ;
    String submissions;
    Course course;

}
class Notifications{
    ArrayList<Notification>  notifications = new ArrayList<Notification>();
}
class Notification{
    String user_id;
    String description;
    String is_seen;
    String created_at;
    String id;
}



