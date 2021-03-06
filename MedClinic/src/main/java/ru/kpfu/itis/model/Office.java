package ru.kpfu.itis.model;

import javax.persistence.*;

@Entity
@Table(name = "office")
public class Office {

    public Office() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "street")
    private String street;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "med_clinic_id")
    private MedClinic medClinic;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public MedClinic getMedClinic() {
        return medClinic;
    }

    public void setMedClinic(MedClinic medClinic) {
        this.medClinic = medClinic;
    }
}
