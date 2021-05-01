package com.company;

public class StudentManager extends  UserManager {
    @Override
    public void add(User user) {
        super.add(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public void login(User user) {
        super.login(user);
    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void list(User user) {
        super.list(user);
    }
    public void courseBuy(Student student,Instructor instructor)
    {
        System.out.println(student.getFirstName()+" adlı öğrenci "+instructor.getEducation()+" adlı kursu satın aldı");
    }
}
