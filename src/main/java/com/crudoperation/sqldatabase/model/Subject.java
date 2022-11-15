package com.crudoperation.sqldatabase.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "subject")
@Getter @Setter
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private long subjectId;

    @Column
    private String subjectName;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "student_s_id",referencedColumnName = "s_id")
    private Student student;

}
