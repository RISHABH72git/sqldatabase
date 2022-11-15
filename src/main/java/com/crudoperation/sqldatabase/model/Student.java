package com.crudoperation.sqldatabase.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "student")
@Getter @Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private long sId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_class")
    private String sClass ;

    @Column(name = "s_school_name")
    private  String sSchoolName;

    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private Set<Subject> subject;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "address_a_id",referencedColumnName = "a_id")
    private Address address;
}
