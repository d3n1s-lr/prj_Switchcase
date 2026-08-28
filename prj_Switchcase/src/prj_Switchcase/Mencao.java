package prj_Switchcase;

import java.util.Scanner;

public class Mencao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mencao;
		
		System.out.println("Digite a menção:");
		mencao = in.next();
		
		switch(mencao) {
		case "MB":
			System.out.println("Excelente Desempenho");
			break;
		case "B":
			System.out.println("Bom Desempenho");
			break;
		case "R":
			System.out.println("Desempenho Regular");
			break;
		case "I":
			System.out.println("Desempenho Insatisfatório");
			break;
		default:
			System.out.println("Menção não registrada");
		}
	}
}
