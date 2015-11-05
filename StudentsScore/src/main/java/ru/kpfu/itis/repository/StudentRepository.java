package ru.kpfu.itis.repository;

import ru.kpfu.itis.model.Student;

public interface StudentRepository {

    public Student getByName(String firstname, String surname, String lastname);

}
