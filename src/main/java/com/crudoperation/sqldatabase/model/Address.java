package com.crudoperation.sqldatabase.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "address")
@Getter @Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private long aId;

    @Column
    private String state;

    @Column
    private  String country;

    @Column
    private String district;

    @OneToMany(mappedBy = "address")
    @JsonManagedReference
    private Set<Student> student;

}
