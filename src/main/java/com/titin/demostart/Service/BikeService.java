package com.titin.demostart.Service;

import com.titin.demostart.Dao.BikeDao;
import com.titin.demostart.Entity.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BikeService {
    @Autowired
    private BikeDao bikeDao;

    public Collection<Bike> getAllBikes() {
        return this.bikeDao.getAllBikes();
    }

    public Bike getBikeById(int id) {
        return this.bikeDao.getBikeById(id);
    }

    public void addBike(Bike bike) {
        this.bikeDao.addBike(bike);
    }

    public void removeBike(int id) {
        this.bikeDao.removeBike(id);
    }
}
