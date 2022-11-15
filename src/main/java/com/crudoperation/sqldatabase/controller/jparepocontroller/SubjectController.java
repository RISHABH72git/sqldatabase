package com.crudoperation.sqldatabase.controller.jparepocontroller;

import com.crudoperation.sqldatabase.dto.BasicDto;
import com.crudoperation.sqldatabase.model.Subject;
import com.crudoperation.sqldatabase.service.jpaqueryservice.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jpaRepository/subject/")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping("addSubject")
    public Subject addSubject(@RequestBody BasicDto basicDto){
        return subjectService.addSubject(basicDto);
    }

    @DeleteMapping("deleteSubjectById")
    public void deleteSubjectById(@RequestParam long id){
         subjectService.deleteSubjectById(id);
    }

    @DeleteMapping("deleteSubjectByName")
    public void deleteSubjectByName(@RequestParam String name){
        subjectService.deleteSubjectByName(name);
    }

    @PutMapping("updateSubjectByName")
    public void updateSubjectByName(@RequestParam String name, @RequestBody BasicDto basicDto){
        subjectService.updateSubjectByName(name, basicDto);
    }

    @PutMapping("updateSubjectById")
    public void updateSubjectById(@RequestParam long id, @RequestBody BasicDto basicDto){
        subjectService.updateSubjectById(id, basicDto);
    }

    @GetMapping("getAllSubject")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }

    @GetMapping("getSubjectById")
    public Subject getSubjectById(@RequestParam long id){
        return subjectService.getSubjectById(id);
    }

    @GetMapping("getSubjectByName")
    public Subject getSubjectByName(@RequestParam String name){
        return subjectService.getSubjectByName(name);
    }
}
