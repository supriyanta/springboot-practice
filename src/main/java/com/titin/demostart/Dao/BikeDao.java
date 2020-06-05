package com.titin.demostart.Dao;

import com.titin.demostart.Entity.Bike;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BikeDao {
    private static Map bikes;

    static {
        bikes = new HashMap<Integer, Bike>();
        bikes.put(1, new Bike(1, "Suzuki", "Blue"));
        bikes.put(2, new Bike(2, "Ducati", "Blood Red"));
        bikes.put(3, new Bike(3, "Honda", "Orange"));
        bikes.put(4, new Bike(4, "Yamaha", "Deep Blue"));
    }

    public Collection<Bike> getAllBikes() {
        return this.bikes.values();
    }

    public Bike getBikeById(int id) {
        return (Bike) this.bikes.getOrDefault(id, this.bikes.get(1));
    }

    public void addBike(Bike bike) {
        this.bikes.put(bike.getId(), bike);
    }

    public void removeBike(int id) {
        this.bikes.remove(id);
    }
}
