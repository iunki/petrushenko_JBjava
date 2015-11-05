package ru.kpfu.itis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient_data")
public class PatientData {

    public PatientData() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "visit_date", nullable = false)
    private Date visitDate;

    @Column(name = "cost")
    private Integer cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "people_id", nullable = false)
    private People people;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
