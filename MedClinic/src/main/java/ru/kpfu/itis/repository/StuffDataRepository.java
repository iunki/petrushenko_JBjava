package ru.kpfu.itis.repository;

import java.math.BigDecimal;
import java.sql.Date;


/**
 * Created by Юлия on 04.11.2015.
 */
public interface StuffDataRepository {


    BigDecimal findAvgSalaryByMedClinic(String name);

    public Integer getSalaryOfStuff(String medClinicName, String fio);

    public Date getStartDate(String medClinicName, String fio);

    public Date getEndDate(String medClinicName, String fio);

}
