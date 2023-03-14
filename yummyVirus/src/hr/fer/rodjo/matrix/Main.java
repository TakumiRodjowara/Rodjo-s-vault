package hr.fer.rodjo.matrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Program za rjesavanje jednadzbi s vise nepoznanica pomocu matrica.");
		System.out.println("Zasad rjesava samo kvadratne matrice (n nepoznanica i n jednadzbi).");
		System.out.println("Dodatni features dolaze uskoro");
		System.out.println("\n");
		
		System.out.println("Jednadzbe sa cijelim vrijdnostima (1) ili s decimalnim brojevima (2)?");
		
		int type = sc.nextInt();
		int size = 0;
		
		System.out.println("Upisi dimenziju matrice: ");
		size = sc.nextInt();
		
		Matrix Matrica = new Matrix(null);
		double[][] matrica = Matrica.create(size);
		
		//Matrica.fillRandom(size, matrica);
		Matrica.fillUserInput(size, matrica);
		
		System.out.print("Originalna matrica:\n");
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size+1; j++) {
				System.out.print(matrica[i][j] + " ");
				if((j+1)%size == 0 && j != 0) System.out.print(" | ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		Matrica.resiMatricu(matrica, size, type);
		
		System.out.println("Rjesena matrica:\n");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size+1; j++) {
				System.out.print(matrica[i][j] + " ");
				if((j+1)%size == 0 && j != 0) System.out.print(" | ");
			}
			System.out.print("\n");
		}
		
		sc.close();

	}

}
