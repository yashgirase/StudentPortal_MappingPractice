package com.example.Service;

import com.example.Entity.Address;
import com.example.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address added successfully";
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public Iterable<Address> getAllAddresss() {
        return addressRepo.findAll();
    }

    public String updateLandmarkOfAddress(Long id, String landmark) {
        Optional<Address> optional = addressRepo.findById(id);
        Address address;
        if(optional.isPresent()){
            address = optional.get();
        }else{
            return "Address not found..";
        }
        address.setLandmark(landmark);
        addressRepo.save(address);
        return "Address landmark updated successfully";
    }

    public String removeAddress(Long id) {
        addressRepo.deleteById(id);
        return "Address removed successfully..";
    }
}