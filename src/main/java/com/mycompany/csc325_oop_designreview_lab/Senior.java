package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    private static final int MINIMUM_CREDITS = 85 ;

    public Senior(String name, short age, int credits) {
        super(name, age, credits);

        if (credits < MINIMUM_CREDITS) {
            throw new IllegalArgumentException(
                    "A Senior must have at least 85 credits. Provided: " + credits);
        }

    }
}
