package com.prueba.giraldo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer id;

    @Column(name = "surname", length = 20)
    private String surname;

    @Column(name = "second_surname", length = 20)
    private String secondSurname;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "other_names", length = 50)
    private String otherNames;

    @ManyToOne
    @JoinColumn(name = "country")
    private CountryEntity country;

    @ManyToOne
    @JoinColumn(name = "identification_type")
    private IdentificationTypeEntity identificationType;

    @Column(name = "identification_number", length = 20)
    private String identificationNumber;

    @Column(name = "email", length = 300)
    private String email;

    @Column(name = "admission_date")
    private Date admissionDate;

    @ManyToOne
    @JoinColumn(name = "work_area")
    private WorkAreaEntity workArea;

    @Column(name = "status", columnDefinition = "boolean default true")
    private Boolean status;

    @Column(name = "create_at")
    private Timestamp createAt;
    public EmployeeEntity(){}
    public EmployeeEntity(Integer id, String surname, String secondSurname, String firstName, String otherNames, CountryEntity country, IdentificationTypeEntity identificationType, String identificationNumber, String email, Date admissionDate, WorkAreaEntity workArea, Boolean status, Timestamp createAt) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public IdentificationTypeEntity getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(IdentificationTypeEntity identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public WorkAreaEntity getWorkArea() {
        return workArea;
    }

    public void setWorkArea(WorkAreaEntity workArea) {
        this.workArea = workArea;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
}
