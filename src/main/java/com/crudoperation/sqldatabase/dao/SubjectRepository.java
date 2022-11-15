package com.crudoperation.sqldatabase.dao;

import com.crudoperation.sqldatabase.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    Set<Subject> findBySubjectNameIn(List<String> subName);

    Subject findBySubjectName(String subName);
}