package java_Jigsaw_Code_Reconstruction_Challenge;

// Make the following code to perform abstraction with polymorphism

  abstract class Shape {

	  abstract void draw();

}

class Circle extends Shape {

	void draw() {

		System.out.println("Drawing a Circle");

	}

}

public class C7_TestPolymorphism {

	public static void main(String[] args) {

		Shape myShape = new Circle();

		myShape.draw();

	}

}

