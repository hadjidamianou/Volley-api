package com.dhadji.volleyapi.model;

public class Player {
    private final String name;
    private final String surname;
    private final String sex;
    private final String email;
    private final long id;


    public Player(String name, String surname, String sex, String email, long id) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
