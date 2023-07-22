package com.example.Service;

import com.example.Entity.Laptop;
import com.example.Entity.Student;
import com.example.Repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "Laptop added successfully";
    }

    public Optional<Laptop> getLaptopById(Integer id) {
        return laptopRepo.findById(id);
    }

    public Iterable<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public String updatePriceOfLaptop(Integer id, Integer price) {
        Optional<Laptop> optional = laptopRepo.findById(id);
        Laptop laptop;
        if(optional.isPresent()){
            laptop = optional.get();
        }else{
            return "laptop not found with id " + id;
        }
        laptop.setPrice(price);
        laptopRepo.save(laptop);
        return "Laptop price for laptop with id "+id+ " successfully updated as "+price;
    }

    public String removeLaptop(Integer id) {
        laptopRepo.deleteById(id);
        return "Laptop with id "+id+" is removed successfully..";
    }
}