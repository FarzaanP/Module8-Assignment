/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
//extended the class to Humans
public class Student extends Human{
	// ToDo 1: Make this class a child of Human - Done

// added the two abstract methods from Human class
    @Override
    public String getAddress() {
        return "Unknown";
    }

    @Override
    public void setAddress(String address) {
    }

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
