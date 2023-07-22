package com.example.Controller;

import com.example.Entity.Laptop;
import com.example.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("Laptop")
    public String addLaptop(@RequestBody Laptop Laptop){
        return laptopService.addLaptop(Laptop);
    }
    @GetMapping("Laptop/id")
    public Optional<Laptop> getLaptopById(@RequestParam Integer id){
        return laptopService.getLaptopById(id);
    }
    @GetMapping("Laptops")
    public Iterable<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }
    @PutMapping("Laptop/id/{id}/price/{price}")
    public String updatePriceOfLaptop(@PathVariable Integer id , @PathVariable Integer price){
        return laptopService.updatePriceOfLaptop(id , price);
    }

    @DeleteMapping("Laptop/id/{id}")
    public String removeLaptop(@PathVariable Integer id){
        return laptopService.removeLaptop(id);
    }
}