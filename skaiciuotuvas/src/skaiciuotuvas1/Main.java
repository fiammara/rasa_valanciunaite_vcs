package skaiciuotuvas1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader =new Scanner(System.in);
System.out.println("Sumuoti 1:");

System.out.println("Atimti 2:");
System.out.println("Dalinti 3:");
System.out.println("Dauginti 4:");
System.out.println("Traukti ðakná 5:");
System.out.println("Kelti kvadratu 6:");
int number=reader.nextInt();
if (number==1){ sum();}
if (number==2){ subst();}
if (number==3){div();}
if (number==4){mult();}
if (number==5) {root();}
if (number==6){pow();}
reader.close();
	}

	private static int pow() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter  integer value: ");
        int first = in.nextInt();
        System.out.println("Enter degree: ");
        int second = in.nextInt();
        int pow = Math.pow(first, second);
        return pow;
		
	}

	private static void root() {
		// TODO Auto-generated method stub
		
	}

	private static void mult() {
		// TODO Auto-generated method stub
		
	}

	private static void div() {
		// TODO Auto-generated method stub
		
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