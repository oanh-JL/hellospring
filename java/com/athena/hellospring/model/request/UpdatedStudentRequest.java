package com.athena.hellospring.model.request;

import java.time.LocalDate;

public class UpdatedStudentRequest {
    private String name;
    private LocalDate dateOfBirth;
    private String className;

    public String getName() {
        return name;
    }

    public UpdatedStudentRequest setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public UpdatedStudentRequest setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public UpdatedStudentRequest setClassName(String className) {
        this.className = className;
        return this;
    }
}
