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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}
