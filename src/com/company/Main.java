package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        User user = new User();
        user.setId(1);
        user.setFirstName("Kadir");
        user.setLastName("Demirel");
        user.setCountryIdentity("12345678901");
        user.setEmail("kadir33@gmail.com");
        user.setPassword("kadir1234");
        user.setAge("23");

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFirstName("Berna");
        instructor.setLastName("Demirel");
        instructor.setCountryIdentity("12345678902");
        instructor.setEmail("berna@gmail.com");
        instructor.setPassword("berna1234");
        instructor.setAge("23");
        instructor.setUserName("berna33");
        instructor.setArea("Yazılım");
        instructor.setEducation("Java Kampı");

        Student student = new Student();
        student.setId(3);
        student.setFirstName("Miray");
        student.setLastName("Demirel");
        student.setCountryIdentity("12345678903");
        student.setEmail("miray@gmail.com");
        student.setPassword("miray1234");
        student.setAge("1");
        student.setUserName("miray33");

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        studentManager.add(student);

        instructorManager.addCourse(instructor);

        studentManager.courseBuy(student,instructor);



        User[] users = {student, instructor, user};
        userManager.listMultiple(users);

    }
}
