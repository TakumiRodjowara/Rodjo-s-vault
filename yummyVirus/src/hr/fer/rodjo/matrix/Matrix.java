package hr.fer.rodjo.matrix;

import java.util.Scanner;

public class Matrix {

private double[][] matrix;
	
	public Matrix(double[][] matrix) {
		this.matrix = matrix;
	}

	public double[][] create(int size){
		this.matrix = new double[size][size+1];
		return matrix;
	}
	
	public double[][] fillRandom(int size, double[][] matrix) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size+1; j++) {
				matrix[i][j] = (int)(Math.random()*23);
			}
		}
		return matrix;
	}
	
	public double[][] fillUserInput(int size, double[][] matrix){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			System.out.print(i+1 + ". jednadzba:\n");
			for (int j = 0; j < size+1; j++) {
				matrix[i][j] = sc.nextDouble();
			}
		}
		sc.close();
		return matrix;
	}
	
	public double[][] resiMatricu(double[][] matrix, int size, int type){
		
		Calc Calculate = new Calc();
		
		for (int i = 0; i < size; i++) {
			int indeks = Calc.nadjiJedinicu(matrix, size, i);
			matrix = Calculate.podijeli(matrix, i, size, type);
			matrix = Calculate.ponistiRed(matrix, size, i);
		}
		
		return matrix;
	}
	
}
