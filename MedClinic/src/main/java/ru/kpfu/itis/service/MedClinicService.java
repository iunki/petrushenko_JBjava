package ru.kpfu.itis.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public interface MedClinicService {

    public BigDecimal getAverageSalary(String name);

    public Integer getSalaryOfStuff(String medClinicName, String fio);

    public Date getStartDate(String medClinicname, String fio);

    public Date getEndDate (String medClinicName, String fio);

    public BigDecimal getAvgMedCheck(String medClinicName);

    public BigDecimal getAvgMedAndOfficeCheck(String medClinicName, String city, String street);

    public String getProfitableClinic();


}
