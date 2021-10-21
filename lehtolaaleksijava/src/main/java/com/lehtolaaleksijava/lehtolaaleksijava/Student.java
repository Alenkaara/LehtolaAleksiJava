package com.lehtolaaleksijava.lehtolaaleksijava;

public class Student {
    private long studentId;
    private String firstName;
    private String lastName;

    private static long idCounter = 0;

    public Student(long studentId, String firstName, String lastName) {
        this.studentId = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return this.studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(getLastName() + " " + getFirstName());
    }

}
