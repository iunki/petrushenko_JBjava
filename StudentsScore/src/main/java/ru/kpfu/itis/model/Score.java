package ru.kpfu.itis.model;

import ru.kpfu.itis.model.enums.Subject;

import javax.persistence.*;

@Entity
@Table(name = "scores")
public class Score {

    public Score() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "subject_type")
    @Enumerated(EnumType.STRING)
    private Subject subject_type;

    @Column(name = "score")
    private int score;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(Subject subject_type) {
        this.subject_type = subject_type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}