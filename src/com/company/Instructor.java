package com.company;

public class Instructor extends User {
    private String area;
    private String education;

    public Instructor() {

    }

    public Instructor(String area, String education) {
        super();
        this.area = area;
        this.education = education;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
