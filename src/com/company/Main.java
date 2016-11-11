package com.company;

public class Main {

    public static void main(String[] args) {
        Code replace = new Code("Tester");
        HighSchoolClass tester = new HighSchoolClass();

        System.out.println("CODE TEST");
        System.out.println(replace.getCode());
        replace.hide(1,4);
        System.out.println(replace.getCode());
        replace.recover(1,2);
        System.out.println(replace.getCode());

        System.out.println("");
        System.out.println("HIGH SCHOOL TEST");

        Student victorian = tester.getValedictorian();
        System.out.println(victorian.getGPA());
        System.out.println((tester.getHonorsPercentage()*100) + "% received honors");
    }
}//Was also confused about what exactly the student class contained
//Also Fernando's project helped sorry for some similarities