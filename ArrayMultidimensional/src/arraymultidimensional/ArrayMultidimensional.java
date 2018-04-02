package arraymultidimensional;
import java.util.Arrays;
public class ArrayMultidimensional {
	public static void main(String[] args) {
		String turma[][] = {
				{"Douglas", "Gonçalves", "5.5"},
				{"Douglas", "Lacerda", "6.5"},
				{"Felipe", "Lopes", "5.5"},
				{"Glaucio", "João", "7.0"},
				{"Isabella", "Reis", "5.5"}
		};
		// Exibir a quantidade de linhas da matriz
		System.out.println(turma.length);
		// Exibir a quantidade de colunas da matriz
		System.out.println(turma[0].length);
		System.out.println("--------------------------------------------");
		System.out.println("Turma é uma matriz da forma " + turma.length + " x " + turma[0].length + ".");
		// Exibir pelo índice da matriz
		System.out.println("--------------------------------------------");
		System.out.println("Nome: " + turma[1][0]);
		System.out.println("Último nome: " + turma[1][1]);
		System.out.println("Nota: " + turma[1][2]);
	}

}
