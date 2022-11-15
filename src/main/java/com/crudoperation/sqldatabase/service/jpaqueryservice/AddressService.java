package com.crudoperation.sqldatabase.service.jpaqueryservice;

import com.crudoperation.sqldatabase.dao.AddressRepository;
import com.crudoperation.sqldatabase.dto.BasicDto;
import com.crudoperation.sqldatabase.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address addAddress(BasicDto basicDto) {
        Address address = new Address();
        address.setCountry(basicDto.getCountry());
        address.setDistrict(basicDto.getDistrict());
        address.setState(basicDto.getState());
        addressRepository.save(address);
        return address;
    }

    public void deleteAddress(BasicDto basicDto) {
        Address address = new Address();
        address.setCountry(basicDto.getCountry());
        address.setDistrict(basicDto.getDistrict());
        address.setState(basicDto.getState());
        addressRepository.delete(address);
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public void updateAddressById(long id, BasicDto basicDto) {
        Address address = addressRepository.findById(id).get();
        if (basicDto.getCountry() != null)
            address.setCountry(basicDto.getCountry());
        if (basicDto.getDistrict() != null)
            address.setDistrict(basicDto.getDistrict());
        if (basicDto.getState() != null)
            address.setState(basicDto.getState());
        addressRepository.save(address);
    }

    public Address getAddressById(long id) {
        return addressRepository.findById(id).get();
    }

    public Address getAddressByCountry(String country) {
        return addressRepository.findByCountry(country);
    }

    public Address getAddressByState(String state) {
        return addressRepository.findByState(state);
    }

    public Address getAddressByDistrict(String district) {
        return addressRepository.findByDistrict(district);
    }

    public Address getAddressByStudentName(String studentName) {
        return addressRepository.findBystudent_sName(studentName);
    }

    public List<Address> getAddressByStudentClass(String sClass) {
        return addressRepository.findAllBystudent_sClass(sClass);
    }

    public List<Address> getAddressByStudentSchoolName(String schoolName) {
        return addressRepository.findAllBystudent_sSchoolName(schoolName);
    }

    public Address getAddressByStudentId(long id) {
        return addressRepository.findBystudent_sId(id);
    }

}
