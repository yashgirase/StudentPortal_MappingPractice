package com.example.Controller;

import com.example.Entity.Address;
import com.example.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping("address/id")
    public Optional<Address> getAddressById(@RequestParam Long id){
        return addressService.getAddressById(id);
    }
    @GetMapping("addresses")
    public Iterable<Address> getAllAddresses(){
        return addressService.getAllAddresss();
    }
    @PutMapping("address/id/{id}/landmark/{landmark}")
    public String updateLandmarkOfAddress(@PathVariable Long id , @PathVariable String landmark){
        return addressService.updateLandmarkOfAddress(id , landmark);
    }

    @DeleteMapping("address/id/{id}")
    public String removeAddress(@PathVariable Long id){
        return addressService.removeAddress(id);
    }
}