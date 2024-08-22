package org.example.embed;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Embeddable
public class FullName {

    private String firstName;
    private String lastName;

    public FullName() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
}
