package arraymultidimensional;
import java.util.Arrays;
public class ArrayMultidimensional {
	public static void main(String[] args) {
		String turma[][] = {
				{"Douglas", "Gon�alves", "5.5"},
				{"Douglas", "Lacerda", "6.5"},
				{"Felipe", "Lopes", "5.5"},
				{"Glaucio", "Jo�o", "7.0"},
				{"Isabella", "Reis", "5.5"}
		};
		// Exibir a quantidade de linhas da matriz
		System.out.println(turma.length);
		// Exibir a quantidade de colunas da matriz
		System.out.println(turma[0].length);
		System.out.println("--------------------------------------------");
		System.out.println("Turma � uma matriz da forma " + turma.length + " x " + turma[0].length + ".");
		// Exibir pelo �ndice da matriz
		System.out.println("--------------------------------------------");
		System.out.println("Nome: " + turma[1][0]);
		System.out.println("�ltimo nome: " + turma[1][1]);
		System.out.println("Nota: " + turma[1][2]);
	}

}
