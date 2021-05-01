package com.company;

public class Student extends User {
    private String studentNumber;
    private String school;
    private String episode;

    public Student()
    {

    }
    public Student(String studentNumber,String school,String episode)
    {
        super();
        this.setStudentNumber(studentNumber);
        this.setSchool(school);
        this.setEpisode(episode);
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }
}
