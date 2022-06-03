package com.prueba.giraldo.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class EmployeeDto {
    private Integer id;
    private String surname;
    private String secondSurname;
    private String firstName;
    private String otherNames;
    private CountryDto country;
    private IdentificationTypeDto identificationType;
    private String identificationNumber;
    private String email;
    private Date admissionDate;
    private WorkAreaDto workArea;
    private Boolean status;
    private Timestamp createAt;

    public EmployeeDto(Integer id, String surname, String secondSurname, String firstName, String otherNames, CountryDto country, IdentificationTypeDto identificationType, String identificationNumber, String email, Date admissionDate, WorkAreaDto workArea, Boolean status, Timestamp createAt) {
        this.id = id;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.firstName = firstName;
        this.otherNames = otherNames;
        this.country = country;
        this.identificationType = identificationType;
        this.identificationNumber = identificationNumber;
        this.email = email;
        this.admissionDate = admissionDate;
        this.workArea = workArea;
        this.status = status;
        this.createAt = createAt;
    }
}
