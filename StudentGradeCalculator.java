package task2;
import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String [] subjects = {"Marathi","Hindi","English","History","Geography"};
		int [] marks = new int[subjects.length];
		int totalMarks = 0;
		int noOfSubjects = subjects.length;
		
		for(int i =0; i<noOfSubjects; i++) {
			System.out.println("Enter Marks for Subject"+subjects[i]+"(out of 100)");
			marks[i]= sc.nextInt();
			totalMarks = totalMarks+marks[i];
		}
		
		double percentage = (double) totalMarks/noOfSubjects;
		
		String grade;
		
		if(percentage>=90) {
			grade = "A";
		}else if(percentage>=75 ) {
			grade = "B";
		}else if(percentage>=50) {
			grade = "C";
		}else if (percentage>=35) {
			grade = "D";
		}else {
			grade  = "fail";
		}
		
		System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks + " / " + (noOfSubjects * 100));
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        sc.close();
			}
}
