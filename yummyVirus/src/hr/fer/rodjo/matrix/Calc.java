package hr.fer.rodjo.matrix;

public class Calc {

	public static int zajDjelitelj(double[][] matrix, int size, int indeks) {
		int zajDjel = 1;
		double najveci = 0;
		
		for (int i = indeks; i < size; i++) {
			if(matrix[indeks][i] > najveci) {
				najveci = matrix[indeks][i];
			}
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < najveci; j++) {
				
			}
		}
		
		return zajDjel;
	}
	
	
	public double[][] podijeli(double[][] matrix, int indeks, int size, int type){
		
		//int zajDjel = Calc.zajDjelitelj(matrix, size, indeks);
		double najmanji = Calc.najmanji(matrix, indeks, size);
		for (int i = 0; i < size+1; i++) {
				matrix[indeks][i] /= najmanji; 
		}
		
		return matrix;
	}
	
	public static double najmanji(double matrix[][], int indeks, int size) {
		double najmanji = (double)(Integer.MAX_VALUE);
		
		for (int i = 0; i < size; i++) {
			if((matrix[indeks][i] < najmanji) && (matrix[indeks][i] != 0)) {
				najmanji = matrix[indeks][i];
			}
		}
		
		return najmanji;
	}
	
	public static int nadjiJedinicu(double[][] matrix, int size, int indeks) {
		int cupic = -1;
		
		for (int i = 0; i < size; i++) {
			if(matrix[indeks][i] == 1) {
				cupic = i;
			}
		}
		
		return cupic;
	}
	
	//red je red u kojem je current jedinica
	public double[][] ponistiRed(double[][] matrix, int size, int red){
		int indeks = nadjiJedinicu(matrix, size, red);
		double mnoz = 1;
		
		for (int i = 0; i < size; i++) {
			
			if(indeks == -1) break;
			else mnoz = matrix[i][indeks];
			
			if(i == red) continue;
			else {
				for (int j = 0; j < size + 1; j++) {
					matrix[i][j] -= (matrix[red][j]*matrix[i][indeks]);
				}
			}
			
		}
		
		return matrix;
	}
	
}
