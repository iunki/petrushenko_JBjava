package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.repository.PatientRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;


@Repository
public class PatientRepositoryImpl implements PatientRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public BigDecimal getAvgMedCheck(String medClinicName) {
        try {
            Query query = em.createNativeQuery("select AVG(patient_data.cost) from med_clinic inner join office on med_clinic.id = office.med_clinic_id inner join people on office.id = people.office_id inner join patient_data on patient_data.id = people.id where med_clinic.name = ?");
            query.setParameter(1, medClinicName);
            return (BigDecimal) query.getSingleResult();
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public BigDecimal getAvgMedAndOfficeCheck(String medClinicName, String city, String street) {
        try {
            Query query = em.createNativeQuery("select AVG(patient_data.cost) from med_clinic inner join office on med_clinic.id = office.med_clinic_id inner join people on office.id = people.office_id inner join patient_data on patient_data.id = people.id where med_clinic.name = ? and office.city = ? and office.street = ?");
            query.setParameter(1, medClinicName);
            query.setParameter(2, city);
            query.setParameter(3, street);
            return (BigDecimal) query.getSingleResult();
        } catch (NullPointerException e) {
            return null;
        }
    }
}
