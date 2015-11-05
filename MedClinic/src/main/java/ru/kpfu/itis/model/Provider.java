package ru.kpfu.itis.model;

import javax.persistence.*;

@Entity
@Table(name = "provider")
public class Provider {

    public Provider() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jur_info_id")
    private JurInfo jurInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_id")
    private Office office;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JurInfo getJurInfo() {
        return jurInfo;
    }

    public void setJurInfo(JurInfo jurInfo) {
        this.jurInfo = jurInfo;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
