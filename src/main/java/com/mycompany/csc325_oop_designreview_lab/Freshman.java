package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }
    // returns freshman info in a string
    @Override
    public String toString() {
        return "Freshman{name='" + getName() + "', age=" + getAge()
                + ", credits=" + getCredits() + ", gpa=" + getGpa() + "}";
    }
}
