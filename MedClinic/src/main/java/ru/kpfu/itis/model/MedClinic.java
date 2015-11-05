package ru.kpfu.itis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "med_clinic")
public class MedClinic {

    public MedClinic() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "creatin_date", nullable = false)
    private Date creationDate;

    @Column(name = "licence_number", nullable = false)
    private Integer licenceNumber;

    public Integer getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(Integer licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
