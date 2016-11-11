package com.company;

public class HighSchoolClass {
    private Student [] students = new Student[(int)(Math.random()*5000)];
    public HighSchoolClass(){
        int ip = 0;
        for(Student dummy: students){
            students [ip] = new Student();
            ip++;
        }
    }
    public Student getValedictorian()
    {
        Student value = new Student();
        double pi = 0;
        for(Student x: students)
        {
            if(x.getGPA()>pi)
            {
                value = x;
                pi = x.getGPA();
            }
        }
        return value;
    }
    public double getHonorsPercentage()
    {
        int counter1 = 0;
        Student [] hons = new Student[students.length];
        for(Student dummy: students)
        {
            if(dummy.isHonors())
            {
                hons [counter1] = dummy;
                counter1++;
            }
        }
        Student [] honors = new Student[counter1];
        int counter2 = 0;
        for(Student dummy: honors)
        {
            honors[counter2] = hons [counter2];
            counter2++;
        }
        return honors.length / students.length;
    }
}