package com.nishant;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    private String ananme;
    @Id
    private String aid;
    private String tech;

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
                '}';
    }
}
