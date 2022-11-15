package com.crudoperation.sqldatabase.dao;

import com.crudoperation.sqldatabase.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByCountry(String country);

    Address findByState(String state);

    Address findByDistrict(String district);

    Address findBystudent_sName(String studentName);

    Address findBystudent_sId(long id);

    List<Address> findAllBystudent_sClass(String sClass);

    List<Address> findAllBystudent_sSchoolName(String schoolName);


}