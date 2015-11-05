package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.Student;
import ru.kpfu.itis.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public Student getByName(String firstname, String surname, String lastname) {
        try {
            return (Student) em.createNativeQuery("SELECT * from students WHERE LOWER(firstname) = LOWER(?) AND LOWER(surname) = LOWER(?) AND LOWER(lastname) = LOWER(?)", Student.class)
                    .setParameter(1, firstname)
                    .setParameter(2, surname)
                    .setParameter(3, lastname).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
