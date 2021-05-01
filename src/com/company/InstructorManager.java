package com.company;

public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        super.add(user);
    }

    @Override
    public void login(User user) {
        super.login(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void list(User user) {
        super.list(user);
    }

    @Override
    public void listMultiple(User[] users) {
        super.listMultiple(users);
    }

    public void addCourse(Instructor instructor) {
        System.out.println(instructor.getEducation() + " adlı eğitim sisteme eklendi.");
    }

    public void deleteCourse(Instructor instructor) {
        System.out.println(instructor.getEducation() + " adlı eğitim sistemden silindi.");
    }

    public void updateCourse(Instructor instructor) {
        System.out.println(instructor.getEducation() + " adlı eğitim bilgileri güncellendi.");
    }
    public void listCourse(Instructor instructor)
    {
        System.out.println(instructor.getEducation());
    }


}
