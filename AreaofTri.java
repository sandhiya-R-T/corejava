package ObjectOrientedProgram;

import java.util.Scanner;

class Triangle{
	double tri1,tri2,artri;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of a Triangle: ");
		tri1=sc.nextDouble();
		tri2=sc.nextDouble();
		sc.close();
	}
	void calculateArea() {
		artri=0.5*tri1*tri2;
	}
	void displayArea() {
		System.out.println("The area of Triangle is "+tri1+" and "+tri2+" = " +artri);
	}
}
public class AreaofTri {

	public static void main(String[] args) {
		Triangle trb = new Triangle();
		trb.input();
		trb.calculateArea();
		trb.displayArea();

	}

}
