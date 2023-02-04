package exercice2;

public class Students {
	
	private String name;
	private int age;
	private double GPA;
	
//constructor 
	public Students(String name, int age, double gPA) {
		super();
		this.name = name;
		this.age = age;
		GPA = gPA;
	}

	public Students() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}


}
