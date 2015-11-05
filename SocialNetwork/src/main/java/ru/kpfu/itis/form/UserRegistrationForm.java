package ru.kpfu.itis.form;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class UserRegistrationForm {

    @NotEmpty(message = "Can't be empty")
    private String username;

    @Size(min = 6, max = 24, message = "Password must be from 6 to 24 symbols")
    private String password;

    @NotEmpty(message = "Can't be empty")
    private String firstname;

    @NotEmpty(message = "Can't be empty")
    private String surname;

    private String lastname;

    @Past
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date bDay;

    private String city;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
