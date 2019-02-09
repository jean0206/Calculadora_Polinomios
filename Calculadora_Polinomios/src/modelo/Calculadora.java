package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public Calculadora() {

	}

	public void findPolynomialRoots(int[] coecoefficient) {
		int first = coecoefficient[0];
		int independentTerm = coecoefficient[coecoefficient.length - 1];

		ArrayList<Integer> divisorsOfFirst = findDivisors(first);
		ArrayList<Integer> divisorsOfIndependentTerm = findDivisors(independentTerm);
	
		for (int i = 0; i < divisorsOfFirst.size(); i++) {
		System.out.print(divisorsOfFirst.get(i) + " - ");
	}
	System.out.println("\n" + "-------------------------");
	for (int i = 0; i < divisorsOfIndependentTerm.size(); i++) {
		System.out.print(divisorsOfIndependentTerm.get(i) + " - ");
	}
	System.out.println("\n");

		
	}

	public ArrayList<Integer> findDivisors(int number) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();

		for (int i = number; i > 0; i--) {
			if (number % i == 0) {
				divisors.add(i);
			}
		}

		return divisors;
	}
	
	 /////////////////////////////////

	
	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		Scanner lector = new Scanner(System.in);
		int number = 0;
		while (number < 10) {

			System.out.println("Ingrese numero a \n");
			int a = lector.nextInt();
			System.out.println("Ingrese termino independiente \n");
			int b = lector.nextInt();

			int[] la = { a, b };
			long x=System.currentTimeMillis();
			calc.findPolynomialRoots(la);
			long y= System.currentTimeMillis();
			System.out.println((y/1000)-(x/1000)+"");

			System.out.println("\n");
			number++;
		}
	}

}
