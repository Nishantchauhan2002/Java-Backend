package com.nishant;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Alien {

    private String ananme;
    @Id
    private String aid;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private String tech;
    private Laptop laptop;

    public String getAnanme() {
        return ananme;
    }

    public void setAnanme(String ananme) {
        this.ananme = ananme;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String  toString() {
        return "Alien{" +
                "ananme='" + ananme + '\'' +
                ", aid='" + aid + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
