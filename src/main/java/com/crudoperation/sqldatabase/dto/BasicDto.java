package com.crudoperation.sqldatabase.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class BasicDto {

    private String state;

    private  String country;

    private String district;

    private String sName;

    private String sClass;

    private String sSchoolName;

    private List<String> subjectNameList;

    public String subjectName;

}
