package com.company;

public class UserManager {
    public void login(User user) {

        System.out.println(user.getUserName()+" adlı kullanıcı sisteme giriş yaptı.");
    }
    public void add(User user)
    {
        System.out.println(user.getUserName()+" adlı kullanıcı kayıt edildi.");
    }
    public void addMultiple(User[] users)
    {
        for(User user:users)
        {
            add(user);
        }
    }
    public void delete(User user)
    {
        System.out.println(user.getUserName()+" adlı kullanıcı sistemden silindi.");
    }

    public void update(User user)
    {
        System.out.println(user.getUserName()+" adlı kullanıcı bilgileri güncellendi.");
    }

    public void list(User user)
    {
        System.out.println(user.getFirstName()+" "+user.getLastName());
    }
    public void listMultiple(User[] users)
    {
        for (User user:users)
        {
            list(user);
        }
    }





}
