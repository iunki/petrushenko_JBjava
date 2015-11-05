package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.repository.StuffDataRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.sql.Date;

@Repository
public class StuffDataRepositoryImpl implements StuffDataRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public BigDecimal findAvgSalaryByMedClinic(String name) {
        try {
            Query query = em.createNativeQuery("select AVG(stuff_data.salary) from med_clinic inner join office on med_clinic.id = office.med_clinic_id inner join people on office.id = people.office_id inner join stuff_data on stuff_data.id = people.id where med_clinic.name = ?");
            query.setParameter(1, name);
            return (BigDecimal) query.getSingleResult();
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public Integer getSalaryOfStuff(String medClinicName, String fio) {
        try {
            Query query = em.createNativeQuery("select stuff_data.salary from med_clinic inner join office on med_clinic.id = office.med_clinic_id inner join people on office.id = people.office_id inner join stuff_data on stuff_data.id = people.id where med_clinic.name = ? and people.fio = ?");
            query.setParameter(1, medClinicName);
            query.setParameter(2, fio);
            return (Integer) query.getSingleResult();
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public Date getStartDate(String medClinicName, String fio) {
        try {
            Query query = em.createNativeQuery("select stuff_data.employment_date from med_clinic inner join office on med_clinic.id = office.med_clinic_id inner join people on office.id = people.office_id inner join stuff_data on stuff_data.id = people.id where med_clinic.name = ? and people.fio = ?");
            query.setParameter(1, medClinicName);
            query.setParameter(2, fio);
            return (Date) query.getSingleResult();
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public Date getEndDate(String medClinicName, String fio) {
        try {
            Query query = em.createNativeQuery("select stuff_data.dismissal_date from med_clinic inner join office on med_clinic.id = office.med_clinic_id inner join people on office.id = people.office_id inner join stuff_data on stuff_data.id = people.id where med_clinic.name = ? and people.fio = ?");
            query.setParameter(1, medClinicName);
            query.setParameter(2, fio);
            return ((Date) query.getSingleResult());
        } catch (NullPointerException e) {
            return null;
        }
    }
}
