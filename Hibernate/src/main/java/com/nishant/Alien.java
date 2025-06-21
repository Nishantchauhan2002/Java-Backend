package com.nishant;

import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Alien {

    private String ananme;
    @Id
    private String aid;

    private String tech;
    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptops;

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

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
    public String toString() {
        return "Alien{" +
                "ananme='" + ananme + '\'' +
                ", aid='" + aid + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
