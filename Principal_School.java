package Competencia3;

import java.util.Scanner;

public class Principal_School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name,address,subject,school,country,who;
		int grade;
		
		CPerson person= new CPerson();
		CTeacher teacher = new CTeacher();
		CStudent student = new CStudent();
		CInternationalStudent IS = new CInternationalStudent();
		
		
		System.out.println("*****Welcome*****");
		System.out.println("Who are you?");
		who=sc.nextLine();
		
		switch(who){
		case "person": case "Person":
			System.out.println("Welcome normal person!");
			
			System.out.println("Enter your name please: ");
			name=sc.nextLine();
			person.setName(name);
			
			System.out.println("Enter your address please: ");
			address=sc.nextLine();
			person.setAddress(address);
			
			System.out.println("Information of the person");
			System.out.println("Name: "+person.getName());
			System.out.println("Address: "+person.getAddress());
			break;
			
		case "teacher": case "Teacher":
			System.out.println("Welcome teacher!");
			System.out.println("Enter your name please: ");
			name=sc.nextLine();
			teacher.setName(name);
			
			System.out.println("Enter your address please: ");
			address=sc.nextLine();
			teacher.setAddress(address);
			
			System.out.println("Whitch subject are you teaching: ");
			subject=sc.nextLine();
			teacher.setSubject(subject);
			
			System.out.println("Information of the person");
			System.out.println("Name: "+teacher.getName());
			System.out.println("Address: "+teacher.getAddress());
			System.out.println("Subject: "+teacher.getSubject());
			break;
			
		case "student": case "Student":
			System.out.println("Welcome student!");
			
			System.out.println("Enter your name please: ");
			name=sc.nextLine();
			student.setName(name);
			
			System.out.println("Enter your address please: ");
			address=sc.nextLine();
			student.setAddress(address);
			
			System.out.println("In whitch school are you studying?: ");
			school=sc.nextLine();
			student.setSchool(school);
			
			sc.nextLine();
			System.out.println("In whitch grade are you coursing?: ");
			grade=sc.nextInt();
			student.setGrade(grade);
			
			System.out.println("Information of the person");
			System.out.println("Name: "+student.getName());
			System.out.println("Address: "+student.getAddress());
			System.out.println("School: "+student.getSchool());
			System.out.println("Grade: "+student.getGrade());
			break;
		case "international student": case "International student": case "International Student":
			System.out.println("Welcome civilian!");
			
			System.out.println("Enter your name please: ");
			name=sc.nextLine();
			IS.setName(name);
			
			System.out.println("Enter your address please: ");
			address=sc.nextLine();
			IS.setAddress(address);
			
			System.out.println("In whitch school are you studying?: ");
			school=sc.nextLine();
			IS.setSchool(school);
			
			sc.nextLine();
			System.out.println("In whitch grade are you coursing?: ");
			grade=sc.nextInt();
			IS.setGrade(grade);
			
			sc.nextLine();
			System.out.println("From wich country are you?: ");
			country=sc.nextLine();
			IS.setCountry(country);
			
			System.out.println("Information of the person");
			System.out.println("Name: "+IS.getName());
			System.out.println("Address: "+IS.getAddress());
			System.out.println("School: "+IS.getSchool());
			System.out.println("Grade: "+IS.getGrade());
			System.out.println("County: "+IS.getCountry());
			break;
		default:
			System.out.println("Not avalible");
		}
		
	}

}
