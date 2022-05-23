package ObjectOrientedProgram;

import java.util.Scanner;

class Circle{
	double arcir1,arcir2,areacir;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of Circle: ");
		arcir1=sc.nextDouble();
		arcir2=sc.nextDouble();
		sc.close();
	}
	void calculateArea() {
		areacir=3.14159f*arcir1*arcir2;
	}
	void displayArea() {
		System.out.println("The area of Square is "+arcir1+" and "+arcir2+" = " +areacir);

	}
}
public class AreaofCir {

	public static void main(String[] args) {
		Circle cir=new Circle();
		cir.input();
		cir.calculateArea();
		cir.displayArea();

	}

}
