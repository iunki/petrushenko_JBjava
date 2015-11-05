package ru.kpfu.itis.repository;

import java.math.BigDecimal;

/**
 * Created by Юлия on 04.11.2015.
 */
public interface PatientRepository {

    public BigDecimal getAvgMedCheck(String medClinicName);

    public BigDecimal getAvgMedAndOfficeCheck(String medClinicName, String city, String street);
}
