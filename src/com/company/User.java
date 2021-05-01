package com.company;

public class User {
 private   int id;
    private  String firstName;
    private String lastName;
    private String countryIdentity;
    private  String email;
    private String password;
    private String age;
    private String userName;

    public User()
    {

    }

    public User(int id,String firstName,String lastName,String countryIdentity,String email,String password,String age,String userName)
    {
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.countryIdentity=countryIdentity;
        this.email=email;
        this.password=password;
        this.age=age;
        this.userName=userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryIdentity() {
        return countryIdentity;
    }

    public void setCountryIdentity(String countryIdentity) {
        this.countryIdentity = countryIdentity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
