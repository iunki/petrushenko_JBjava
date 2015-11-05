package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.repository.MedClinicRepository;
import ru.kpfu.itis.repository.StuffDataRepository;
import ru.kpfu.itis.service.MedClinicService;
import ru.kpfu.itis.repository.PatientRepository;

import java.math.BigDecimal;
import java.util.Date;

@Service
@Transactional
public class MedClinicServiceImpl implements MedClinicService {

    @Autowired
    StuffDataRepository stuffDataRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    MedClinicRepository medClinicRepository;

    @Override
    public BigDecimal getAverageSalary(String name) {
        BigDecimal averageSalary = stuffDataRepository.findAvgSalaryByMedClinic(name);
        return averageSalary;
    }

    @Override
    public Integer getSalaryOfStuff(String medClinicName, String fio) {
        return stuffDataRepository.getSalaryOfStuff(medClinicName, fio);
    }

    @Override
    public Date getStartDate(String medClinicname, String fio) {
        return stuffDataRepository.getStartDate(medClinicname, fio);
    }

    @Override
    public Date getEndDate(String medClinicName, String fio) {
        return stuffDataRepository.getEndDate(medClinicName, fio);
    }

    @Override
    public BigDecimal getAvgMedCheck(String medClinicName) {
        return patientRepository.getAvgMedCheck(medClinicName);
    }

    @Override
    public BigDecimal getAvgMedAndOfficeCheck(String medClinicName, String city, String street) {
        return patientRepository.getAvgMedAndOfficeCheck(medClinicName, city, street);
    }

    @Override
    public String getProfitableClinic(){
        return medClinicRepository.getProfitableClinic();
    }
}
