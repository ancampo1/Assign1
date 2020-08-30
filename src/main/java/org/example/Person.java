package org.example;

import java.time.LocalDate;

public class Person {
    private String Fname;

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String LName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age,id;

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    private LocalDate dob;
    public Person (String Fname,String LName,int age, int id, LocalDate date)
    {
        this.Fname = Fname;
        this.LName = LName;
        this.age = age;
        this.id = id;
        this.dob = date;
    }

    @Override
    public String toString() {
              return Fname + " " + LName + " " + age + " " + id + " " + dob;
    }
}
