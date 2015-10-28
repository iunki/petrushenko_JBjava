package ru.kpfu.itis.model;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    public Student() {
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "studgroup", nullable = false)
    private String studgroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStudgroup() {
        return studgroup;
    }

    public void setStudgroup(String studgroup) {
        this.studgroup = studgroup;
    }
}