package com.crudoperation.sqldatabase.service.jpaqueryservice;
import com.crudoperation.sqldatabase.dao.StudentRepository;
import com.crudoperation.sqldatabase.dao.SubjectRepository;
import com.crudoperation.sqldatabase.dto.BasicDto;
import com.crudoperation.sqldatabase.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    public Subject addSubject(BasicDto basicDto){
        Subject subject = new Subject();
        subject.setSubjectName(basicDto.getSubjectName());
        subjectRepository.save(subject);
        return subject;
    }

    public void deleteSubjectById(long subjectId){
        if (subjectRepository.findById(subjectId).isPresent())
            subjectRepository.delete(subjectRepository.findById(subjectId).get());
    }

    public void deleteSubjectByName(String name){
            subjectRepository.delete(subjectRepository.findBySubjectName(name));
    }

    public void updateSubjectByName(String name, BasicDto basicDto){
        Subject subject = subjectRepository.findBySubjectName(name);
        subject.setSubjectName(basicDto.getSubjectName());
        subjectRepository.save(subject);
    }

    public void updateSubjectById(long id, BasicDto basicDto){
        Subject subject = subjectRepository.findById(id).get();
        subject.setSubjectName(basicDto.getSubjectName());
        subjectRepository.save(subject);
    }

    public List<Subject> getAllSubject(){
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(long id){
        return subjectRepository.findById(id).get();
    }

    public Subject getSubjectByName(String name){
        return subjectRepository.findBySubjectName(name);
    }


}
