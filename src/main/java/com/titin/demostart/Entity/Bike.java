package com.titin.demostart.Entity;

public class Bike {
    private int id;
    private String company;
    private String color;

    public Bike() {}

    public Bike(int id, String company, String color) {
        this.id = id;
        this.company = company;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
