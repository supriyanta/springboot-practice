package com.titin.demostart.Controller;

import com.titin.demostart.Entity.Bike;
import com.titin.demostart.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/bikes")
public class BikeController {
    @Autowired
    private BikeService bikeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Bike> getAllBikes() {
        return this.bikeService.getAllBikes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Bike getBikeBtId(@PathVariable int id) {
        return this.bikeService.getBikeById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBike(@RequestBody Bike bike) {
        this.bikeService.addBike(bike);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeBike(@PathVariable int id) {
        this.bikeService.removeBike(id);
    }
}
