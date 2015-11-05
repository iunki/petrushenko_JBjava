package ru.kpfu.itis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "operation_supplier")
public class OperationSupplier {

    public OperationSupplier() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "begin_date", nullable = false)
    private Date beginDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    private Date creationDate;

    @Column(name = "count")
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office_id")
    private Office office;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id")
    private Provider provider;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
