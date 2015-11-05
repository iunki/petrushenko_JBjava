package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.Score;
import ru.kpfu.itis.model.Student;
import ru.kpfu.itis.model.enums.Subject;
import ru.kpfu.itis.repository.ScoreRepository;
import ru.kpfu.itis.repository.StudentRepository;
import ru.kpfu.itis.service.ScoreService;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public BigInteger getSum(Student student) {
        return scoreRepository.getSum(student.getId());
    }

    @Override
    public BigDecimal getAvg(Student student) {
        return scoreRepository.getAvg(student.getId());
    }

    @Override
    public Integer getScore(Student student, Integer subject) {
        return scoreRepository.getScore(student.getId(), Subject.getSubject(subject));
    }

    @Override
    public void addScore(Score score) {
        scoreRepository.addScore(score);
    }
}
