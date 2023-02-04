package exercice2;

import java.util.ArrayList;


public class Course {
	
	private String name;
	
	private ArrayList<Students> studentList ;
	
	//A public constructor that takes in a name as an argument and initializes the corresponding variable

	public Course(String name) {
		super();
		this.name = name;
		this.studentList = new ArrayList<>();
	}
	
	//A public void method called addStudent that takes in a Student object as an argument and adds it to the students ArrayList

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Students> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Students> studentList) {
		this.studentList = studentList;
	}

	public void AddStudent(Students student) {
		
		studentList.add(student);
	}
	
    public void removeStudent(Students student) {
		
    	studentList.remove(student);
	}
    
    
//    A public void method called printStudents that prints out the names of all the students in the students ArrayList
   
   public void printStudents() {
		
	   studentList.forEach(n ->{
		   System.out.println(n.getName());
	   });
	}
	
   
	public Course() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	//main
	


}
