package ru.kpfu.itis.repository;

import ru.kpfu.itis.model.Score;
import ru.kpfu.itis.model.enums.Subject;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface ScoreRepository {

    public BigInteger getSum(Integer id);

    public BigDecimal getAvg(Integer id);

    public Integer getScore(Integer id, Subject subject);

    public void addScore(Score score);

}
