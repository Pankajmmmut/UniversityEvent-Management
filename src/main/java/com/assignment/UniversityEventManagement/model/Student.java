package com.assignment.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private Integer studentId;
    @NotEmpty
    private String firstName;
    private String lastName;
    @Range(min=18,max=25)
    private Integer age;
    private Type department;
}
