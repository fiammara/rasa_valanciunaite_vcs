package skaiciuotuvas1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Pasirinkite norima veiksma (irasykite skaiciu:");
		System.out.println("Sumuoti: 1");
		System.out.println("Atimti: 2");
		System.out.println("Dalinti: 3");
		System.out.println("Dauginti: 4");
		System.out.println("Traukti sakni 5:");
		System.out.println("Kelti kvadratu 6:");
		
		Scanner reader = new Scanner(System.in);
			
		String number = reader.nextLine();
		if (number.equals("1")) {
			sum();
		}
		else if (number.equals("2")) {
			substract();
		}
		else if (number.equals("3")) {
			div();
		}
		else if (number.equals("4")) {
			mult();
		}
		else 	if (number.equals("5")) {
			root();
		}
		else	if (number.equals("6")) {
			pow();
		
		}
		else	 {
			System.out.println("Ivestas netinkamas simbolis");
			
			}
		
		}
	

	private static void pow() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  integer value: ");
		double first = in.nextDouble();
		System.out.println("Enter degree: ");
		double second = in.nextDouble();
		double pow = Math.pow(first, second);
		System.out.println("result=" +pow);

	}

	private static void sqroot() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter  integer value: ");
		int first = in.nextInt();
		double sqroot = Math.sqrt(first);
		System.out.println("result is " +sqroot);
		
	}

	private static void mult() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int mult = first * second;
		System.out.println("result is " +mult);
	}

	private static void div() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		double first = in.nextDouble();
		System.out.println("Enter your second integer value: ");
		double second = in.nextDouble();
		double div = first / second;
		System.out.println("result is " +div);
	}

	private static void substract() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int sub = first - second;
		System.out.println("result is " +sub);
	}

	private static void sum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first integer value: ");
		int first = in.nextInt();
		System.out.println("Enter your second integer value: ");
		int second = in.nextInt();
		int sum = first + second;
		System.out.println( "result is " +sum);

	}
}