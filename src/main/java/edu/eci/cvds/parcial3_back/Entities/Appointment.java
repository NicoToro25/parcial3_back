package edu.eci.cvds.parcial3_back.Entities;

import edu.eci.cvds.parcial3_back.Enum.Specialty;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;

import java.time.LocalDate;

public class Appointment {

    private LocalDate Date;
    private Specialty Specialty;
    private String Doctor;
    private String Location;

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public edu.eci.cvds.parcial3_back.Enum.Specialty getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(edu.eci.cvds.parcial3_back.Enum.Specialty specialty) {
        Specialty = specialty;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}