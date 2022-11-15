package com.crudoperation.sqldatabase.service.jpaqueryservice;

import com.crudoperation.sqldatabase.dao.AddressRepository;
import com.crudoperation.sqldatabase.dao.StudentRepository;
import com.crudoperation.sqldatabase.dao.SubjectRepository;
import com.crudoperation.sqldatabase.dto.BasicDto;
import com.crudoperation.sqldatabase.model.Student;
import com.crudoperation.sqldatabase.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    AddressService addressService;

    @Autowired
    AddressRepository addressRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student addStudentByAddressId(long addressId,BasicDto basicDto){
        Student student = new Student();
        student.setSName(basicDto.getSName());
        student.setSClass(basicDto.getSClass());
        student.setSSchoolName(basicDto.getSSchoolName());
        Set<Subject> subjectSet = subjectRepository.findBySubjectNameIn(basicDto.getSubjectNameList());
        student.setSubject(subjectSet);
        student.setAddress(addressRepository.findById(addressId).get());
        studentRepository.save(student);
        return student;
    }

    public void deleteStudentById(long id){
        studentRepository.delete(studentRepository.findById(id).get());
    }

    public void deleteStudentByName(String name){
        studentRepository.delete(studentRepository.findBysName(name));
    }
    public void deleteStudentBySchoolName(String schoolName){
        studentRepository.deleteAll(studentRepository.findAllBysSchoolName(schoolName));
    }

    public void deleteStudentByAddressId(long id){
        studentRepository.deleteAll(studentRepository.findByaddress_aId(id));
    }

    public Student getStudentById(long id){
        return studentRepository.findById(id).get();
    }

    public Student getStudentByName(String name){
        return studentRepository.findBysName(name);
    }

    public List<Student> getStudentBySchoolName(String schoolName){
        return studentRepository.findAllBysSchoolName(schoolName);
    }

    public List<Student> getStudentByClass(String studentClass){
        return studentRepository.findAllBysClass(studentClass);
    }

    public Student updateStudentById(long id, BasicDto basicDto){
        Student student = studentRepository.findById(id).get();
        if (basicDto.getSName() != null)
            student.setSName(basicDto.getSName());
        if (basicDto.getSClass() != null)
            student.setSClass(basicDto.getSClass());
        if (basicDto.getSSchoolName() != null)
            student.setSSchoolName(basicDto.getSSchoolName());
        studentRepository.save(student);
        return student;
    }

    public Student updateStudentByName(String name, BasicDto basicDto){
        Student student = studentRepository.findBysName(name);
        if (basicDto.getSName() != null)
            student.setSName(basicDto.getSName());
        if (basicDto.getSClass() != null)
            student.setSClass(basicDto.getSClass());
        if (basicDto.getSSchoolName() != null)
            student.setSSchoolName(basicDto.getSSchoolName());
        studentRepository.save(student);
        return student;
    }

    public List<Student> getStudentByAddressId(long id){
        return studentRepository.findByaddress_aId(id);
    }

    public List<Student> getStudentByAddressState(String state){
        return studentRepository.findAllByaddress_state(state);
    }

    public List<Student> getStudentByAddressCountry(String country){
        return studentRepository.findAllByaddress_country(country);
    }

    public List<Student> getStudentByAddressDistrict(String district){
        return studentRepository.findAllByaddress_district(district);
    }


}
