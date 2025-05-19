package com.nishant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import jakarta.persistence.Entity;


@Entity
public class Student {
    @Id
    private String rollNo;
    private String sName;
    private int sAge;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
}
