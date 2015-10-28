package itis.model;


public class User {

    private String name;
    private String surname;
    private String patronymic;
    private String date;
    private String gender;

    public User() {
    }

    public User(String name, String surname, String date, String patronimyc, String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronimyc;
        this.date = date;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}