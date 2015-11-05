package ru.kpfu.itis.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.Score;
import ru.kpfu.itis.model.Student;
import ru.kpfu.itis.model.enums.Subject;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public interface ScoreService {

    public BigInteger getSum(Student student);

    public BigDecimal getAvg(Student student);

    public Integer getScore(Student student, Integer subject);

    void addScore(Score score);

}
