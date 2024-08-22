package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullName;

@Entity
//@Entity(name = "teacher")    table eke nama wenas karnw
public class student {
 @Id
    private int id;
    private FullName name;
    private String address;

    public student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public student(int id, FullName name, String address) {
        this.id = id;
        this.name = name;

        this.address = address;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }


}
