package gpa_calculator;
import java.util.Scanner;
import java.util.*;


public class gpa_calculator {
	public static void main(String [] args) { 
	      Scanner scnr = new Scanner(System.in);
	      
	      // instantiate variables 
	      int counterControl = 10;
	      double gradePointAverage;
	      List<Double> gradesList = new Stack<Double>();
	      double maxGrade;
	      double minGrade;
	      double currentGrade;
	      
	      
	      
	      // display program name
	      System.out.println("---GRADE POINT AVERAGE CALCULATOR---");
	      
	      while (counterControl != 0) {
	    	  // prompt the user to enter their grades
	    	  System.out.println("Enter your grade: ");
	    	  currentGrade = scnr.nextDouble();
	    	  // add the grade to the list
	    	  gradesList.add(currentGrade);
	    	  counterControl = counterControl - 1;
	      }
	      // sort the list of grades
	      Collections.sort(gradesList);
	      // get minimum and maximum grade from list
	      maxGrade = gradesList.get(9);
	      minGrade = gradesList.get(0);
	      
	      double gradesSum = 0;
	      // add em all together
	      for (int i = 0; i < gradesList.size(); i++) {
	    	   gradesSum += gradesList.get(i);
	      }
	      // get the GPA
	      gradePointAverage = gradesSum / 10;
	      
	      
	      // print to console
	      System.out.println("Max Grade: " + maxGrade);
	      System.out.println("Min Grade: " + minGrade);
	      System.out.println("Grade Point Average: " + gradePointAverage);
	      // end
	}
}
