package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.model.Score;
import ru.kpfu.itis.model.Student;
import ru.kpfu.itis.model.enums.Subject;
import ru.kpfu.itis.repository.ScoreRepository;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


@Repository
public class ScoreRepositoryImpl implements ScoreRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public BigInteger getSum(Integer id) {
        Query query = em.createNativeQuery("SELECT SUM(score) FROM scores WHERE student_id = ?");
        query.setParameter(1, id);
        return (BigInteger) query.getSingleResult();
    }

    @Override
    public BigDecimal getAvg(Integer id) {
        Query query = em.createNativeQuery("SELECT AVG(score) FROM scores WHERE student_id = ?");
        query.setParameter(1, id);
        return (BigDecimal) query.getSingleResult();
    }

    @Override
    public Integer getScore(Integer id, Subject subject) {
        Query query = em.createNativeQuery("SELECT score FROM scores WHERE student_id = ? AND subject_type = ?");
        query.setParameter(1, id);
        query.setParameter(2, subject.ordinal());
        return (Integer) query.getSingleResult();
    }

    @Override
    @Transactional
    public void addScore(Score score) {
        em.persist(score);
    }
}

