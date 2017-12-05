package skaiciuotuvas1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		while(true) {
		
		System.out.println("Pasirinkite norimà veiksmà (áraðykite skaièiø:");
		System.out.println("Sumuoti: 1");
		System.out.println("Atimti: 2");
		System.out.println("Dalinti: 3");
		System.out.println("Dauginti: 4");
		System.out.println("Traukti ðakná 5:");
		System.out.println("Kelti kvadratu 6:");
		
		
		int number = reader.nextInt();
		if (number == 1) {
			sum();
		}
		if (number == 2) {
			subst();
		}
		if (number == 3) {
			div();
		}
		if (number == 4) {
			mult();
		}
		if (number == 5) {
			root();
		}
		if (number == 6) {
			pow();
		}
		reader.close();
	}

	private static double pow() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  integer value: ");
		double first = in.nextDouble();
		System.out.println("Enter degree: ");
		double second = in.nextDouble();
		double pow = Math.pow(first, second);
		return pow;

	}

	private static double root() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  integer value: ");
		int first = in.nextInt();
		double root = Math.sqrt(first);
		return root;
		
	}

	private static int mult() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int mult = first * second;
		return mult;
	}

	private static double div() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int div = first / second;
		return div;

	}

	private static int subst() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int sub = first - second;
		return sub;

	}

	private static int sum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int sum = first + second;
		return sum;

	}
}