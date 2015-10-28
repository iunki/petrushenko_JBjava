package ru.kpfu.itis.repository;

import ru.kpfu.itis.model.Student;

/**
 * Created by Юлия on 27.10.2015.
 */
public interface StudentRepository {

    public Student getByName(String firstname, String surname, String lastname);

}
