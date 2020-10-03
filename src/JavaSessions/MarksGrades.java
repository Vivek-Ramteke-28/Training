package JavaSessions;

public class MarksGrades {

	public static void main(String[] args) {

		MarksGrades mg = new MarksGrades();
		mg.gradecal(94);
		mg.gradecal(84);
		mg.gradecal(74);
		mg.gradecal(64);
		mg.gradecal(54);
		mg.gradecal(44);
		mg.gradecal(34);

	}

	public void gradecal(int marks) {

		if (marks >= 91 && marks <= 100) {
			System.out.println("Grade of student is - AA  and marks are " + marks);
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Grade of student is - AB  and marks are " + marks);
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Grade of student is - BB  and marks are " + marks);
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Grade of student is - BC  and marks are " + marks);
		}

		else if (marks >= 51 && marks <= 60) {
			System.out.println("Grade of student is - CD  and marks are " + marks);
		}

		else if (marks >= 41 && marks <= 50) {
			System.out.println("Grade of student is - DD  and marks are " + marks);
		}

		else {
			System.out.println("Sorry..!! You are failed which is haivng marks = " + marks);
		}

	}

}
