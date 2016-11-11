package com.company;

public class Student {
    public double gpa;
    public boolean honors;

    public double getGPA()
    {
        gpa = Math.random();
        return gpa;
    }

    public boolean isHonors()
    {
        honors = 0.5 < Math.random();
        return honors;
    }
}