package com.frank.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="User_Profiles")
public class profileEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public profileEntry() {
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof profileEntry)) return false;
        profileEntry profileEntry = (profileEntry) o;
        return getAge() == profileEntry.getAge() && Objects.equals(getUserID(), profileEntry.getUserID()) && Objects.equals(getFirstName(), profileEntry.getFirstName()) && Objects.equals(getLastName(), profileEntry.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getFirstName(), getLastName(), getAge());
    }

    @Override
    public String toString() {
        return "profileEntry{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public profileEntry(int userID, String firstName, String lastName, int age) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
