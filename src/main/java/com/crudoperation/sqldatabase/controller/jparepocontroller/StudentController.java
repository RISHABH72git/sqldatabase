package com.crudoperation.sqldatabase.controller.jparepocontroller;

import com.crudoperation.sqldatabase.dto.BasicDto;
import com.crudoperation.sqldatabase.model.Student;
import com.crudoperation.sqldatabase.service.jpaqueryservice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jpaRepository/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("addStudentByAddressId")
    public Student addStudentByAddressId(@RequestParam long addressId, @RequestBody BasicDto basicDto){
        return studentService.addStudentByAddressId(addressId, basicDto);
    }

    @DeleteMapping("deleteStudentById")
    public void deleteStudentById(@RequestParam long id){
        studentService.deleteStudentById(id);
    }

    @DeleteMapping("deleteStudentByName")
    public void deleteStudentByName(@RequestParam String name){
        studentService.deleteStudentByName(name);
    }

    @DeleteMapping("deleteStudentBySchoolName")
    public void deleteStudentBySchoolName(@RequestParam String schoolName){
        studentService.deleteStudentBySchoolName(schoolName);
    }

    @DeleteMapping("deleteStudentByAddressId")
    public void deleteStudentByAddressId(@RequestParam long id){
        studentService.deleteStudentByAddressId(id);
    }

    @GetMapping("getStudentById")
    public Student getStudentById(@RequestParam long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("getStudentByName")
    public Student getStudentByName(@RequestParam String name){
        return studentService.getStudentByName(name);
    }

    @GetMapping("getStudentBySchoolName")
    public List<Student> getStudentBySchoolName(@RequestParam String schoolName){
        return studentService.getStudentBySchoolName(schoolName);
    }

    @GetMapping("getStudentByClass")
    public List<Student> getStudentByClass(@RequestParam String sClass){
        return studentService.getStudentByClass(sClass);
    }

    @PutMapping("updateStudentById")
    public Student updateStudentById(@RequestParam long id, @RequestBody BasicDto basicDto){
        return studentService.updateStudentById(id, basicDto);
    }

    @PutMapping("updateStudentByName")
    public Student updateStudentByName(@RequestParam String name, @RequestBody BasicDto basicDto){
        return studentService.updateStudentByName(name, basicDto);
    }

    @GetMapping("getStudentByAddressId")
    public List<Student> getStudentByAddressId(@RequestParam long addressId){
        return studentService.getStudentByAddressId(addressId);
    }

    @GetMapping("getStudentByAddressState")
    public List<Student> getStudentByAddressState(@RequestParam String state){
        return studentService.getStudentByAddressState(state);
    }

    @GetMapping("getStudentByAddressCountry")
    public List<Student> getStudentByAddressCountry(@RequestParam String country){
        return studentService.getStudentByAddressCountry(country);
    }

    @GetMapping("getStudentByAddressDistrict")
    public List<Student> getStudentByAddressDistrict(@RequestParam String district){
        return studentService.getStudentByAddressDistrict(district);
    }


}
