package ObjectOrientedProgram;

import java.util.Scanner;

class Square{
	double sqside1,sqside2,areasq;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of a square: ");
		sqside1=sc.nextInt();
		sqside2=sc.nextInt();
		sc.close();
	}
	void calculateArea() {
		areasq=sqside1*sqside2;
	}
	void displayArea() {
		System.out.println("The area of Square is "+sqside1+" and "+sqside2+" = " +areasq);

	}
}

public class AreaofSqr {

	public static void main(String[] args) {
		Square sob=new Square();
		sob.input();
		sob.calculateArea();
		sob.displayArea();

	}

}
