/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error - Done

		// ToDo 6: Fix the constructor of the Student class - Done

                // Todo 7: Create two classes for Freshman and Senior - Done

                // ToDo 8: The senior class should have a minimum of 85 credits - Done

		// ToDo 9: Add a toString method for the Student class - Done

		// ToDo 10: Add a toString method for the Freshman class - Done

                // ToDo 11: Add a toString method for the Senior class - Done



	 Freshman std1= new Freshman("James", (short) 20, 12); // name, age, credits

	 Senior std2 = new Senior("John", (short) 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output. - Done
	 // asks the user for student 1 gpa
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter GPA for " + std1.getName() + ": ");
	 double gpa1 = scanner.nextDouble();
	 std1.setGpa(gpa1);
	// asks the user for student 2 gpa
	 System.out.print("Enter GPA for " + std2.getName() + ": ");
	 double gpa2 = scanner.nextDouble();
	 std2.setGpa(gpa2);
	// prints out output
	 System.out.println(std1);
	 System.out.println(std2);

		// ToDo 13: add comments and explain your code - Done

	}

}

