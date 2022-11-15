package com.crudoperation.sqldatabase.dao;

import com.crudoperation.sqldatabase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findBysName(String name);

    List<Student> findAllBysSchoolName(String schoolName);

    List<Student> findByaddress_aId(long id);

    List<Student> findAllByaddress_state(String state);

    List<Student> findAllByaddress_country(String country);

    List<Student> findAllByaddress_district(String district);

   List<Student> findAllBysClass(String studentClass);

}