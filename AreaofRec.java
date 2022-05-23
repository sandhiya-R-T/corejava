package ObjectOrientedProgram;

import java.util.Scanner;

class Rectangle{
	int length,breadth,area;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Length and breadth of a rectangle: ");
		length=sc.nextInt();
		breadth=sc.nextInt();
		sc.close();
	}
	void calculateArea() {
		area=length*breadth;
	}
	void displayArea() {
		System.out.println("The area of rectangle of length="+length+ " and breadth="+breadth+ "area="+area+"squnits");
		
	}
	
}

public class AreaofRec {

	public static void main(String[] args) {
		
		Rectangle rob=new Rectangle();
		rob.input();
		rob.calculateArea();
		rob.displayArea();
		
	}

}
