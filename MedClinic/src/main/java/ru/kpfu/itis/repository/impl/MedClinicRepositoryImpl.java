package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.repository.MedClinicRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MedClinicRepositoryImpl implements MedClinicRepository{

    @PersistenceContext
    EntityManager em;

    @Override
    public String getProfitableClinic() {
        List<String> medClinics = getMedClinics();
        return  null; //FIXME

    }

    @Override
    public List<String> getMedClinics() {
        Query query = em.createNativeQuery("select name FROM med_clinic");
        return query.getResultList();
    }
}
