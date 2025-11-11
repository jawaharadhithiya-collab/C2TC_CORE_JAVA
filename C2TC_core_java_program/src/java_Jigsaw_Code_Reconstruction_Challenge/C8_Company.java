package java_Jigsaw_Code_Reconstruction_Challenge;

//Make the following code it Print "myPerson is a Manager."

class Employee {
}

class Manager extends Employee {
}
public class C8_Company {

	public static void main(String[] args) {

		Employee myPerson = new Manager();

		if ( myPerson instanceof Manager) {

			System.out.println("myPerson is a Manager.");

		}
		else 
		{ System.out.println("myPerson is a regular Employee.");}
	

	}

}

