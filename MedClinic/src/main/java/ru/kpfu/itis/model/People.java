package ru.kpfu.itis.model;

import ru.kpfu.itis.model.enums.PeopleType;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class People {

    public People() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "fio", nullable = false)
    private String fio;

    @Column(name = "pasport_series", nullable = false)
    private String pasportSeries;

    @Column(name = "pasport_number", nullable = false)
    private String pasportIssued;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private PeopleType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_id", nullable = false)
    private Office office;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPasportSeries() {
        return pasportSeries;
    }

    public void setPasportSeries(String pasportSeries) {
        this.pasportSeries = pasportSeries;
    }

    public String getPasportIssued() {
        return pasportIssued;
    }

    public void setPasportIssued(String pasportIssued) {
        this.pasportIssued = pasportIssued;
    }

    public PeopleType getType() {
        return type;
    }

    public void setType(PeopleType type) {
        this.type = type;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
