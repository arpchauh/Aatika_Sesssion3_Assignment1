package aatika;
import java.util.*;

public class Session3_Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for square root");
		double square = sc.nextDouble();
		
		double sqr = Math.sqrt(square);
		System.out.println("The square root of "+square+" is "+sqr);
		System.out.println();
		
		System.out.println("Enter the value for Cube Root");
		double Cube = sc.nextDouble();
	
		double cubr = Math.cbrt(Cube);
		System.out.println("The Cube root of "+Cube+" is "+cubr);
	}

}
