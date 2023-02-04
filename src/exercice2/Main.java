package exercice2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course obj = new Course("Computer Science 101");
		
		obj.printStudents();
		
		Students etudiant1 = new Students("John Smith", 20, 3.5);
		Students etudiant2 = new Students("Jane Doe", 21, 3.8);
		Students etudiant3 = new Students("Bob Johnson", 22, 2.5);
		
		//ajout des etudiants
		
		obj.AddStudent(etudiant1);
		obj.AddStudent(etudiant2);
		obj.AddStudent(etudiant3);
		
		
		//affichage des etudiants
		
		obj.printStudents();
		
		obj.removeStudent(etudiant3);
		

	}

}
