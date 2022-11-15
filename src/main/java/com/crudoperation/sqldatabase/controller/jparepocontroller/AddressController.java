package com.crudoperation.sqldatabase.controller.jparepocontroller;

import com.crudoperation.sqldatabase.dto.BasicDto;
import com.crudoperation.sqldatabase.model.Address;
import com.crudoperation.sqldatabase.service.jpaqueryservice.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jpaRepository/address/")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addAddress")
    public Address addAddress(@RequestBody BasicDto basicDto){
        return addressService.addAddress(basicDto);
    }

    @DeleteMapping("deleteAddress")
    public void deleteAddress(@RequestBody BasicDto basicDto){
         addressService.deleteAddress(basicDto);
    }

    @GetMapping("getAllAddress")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PutMapping("updateAddressById")
    public void updateAddressById(@RequestParam long id, @RequestBody BasicDto basicDto){
        addressService.updateAddressById(id, basicDto);
    }

    @GetMapping("getAddressById")
    public Address getAddressById(@RequestParam long id){
        return addressService.getAddressById(id);
    }

    @GetMapping("getAddressByCountry")
    public Address getAddressByCountry(@RequestParam String country){
        return addressService.getAddressByCountry(country);
    }

    @GetMapping("getAddressByState")
    public Address getAddressByState(@RequestParam String state){
        return addressService.getAddressByState(state);
    }

    @GetMapping("getAddressByDistrict")
    public Address getAddressByDistrict(@RequestParam String district){
        return addressService.getAddressByDistrict(district);
    }

    @GetMapping("getAddressByStudentName")
    public Address getAddressByStudentName(@RequestParam String studentName){
        return addressService.getAddressByStudentName(studentName);
    }

    @GetMapping("getAddressByStudentClass")
    public List<Address> getAddressByStudentClass(@RequestParam String studentClass){
        return addressService.getAddressByStudentClass(studentClass);
    }

    @GetMapping("getAddressByStudentSchoolName")
    public List<Address> getAddressByStudentSchoolName(@RequestParam String studentSchoolName){
        return addressService.getAddressByStudentSchoolName(studentSchoolName);
    }

    @GetMapping("getAddressByStudentId")
    public Address getAddressByStudentId(@RequestParam long id){
        return addressService.getAddressByStudentId(id);
    }

}
