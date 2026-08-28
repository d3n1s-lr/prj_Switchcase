package prj_Switchcase;

import java.util.Scanner;

public class Escolinha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade do aluno:");
		idade = in.nextInt();
		switch(idade) {
		case 6:
			System.out.println("dente de leite");
			break;
		case 7:
			System.out.println("júnior");
			break;
		case 8:
			System.out.println("júnior max");
			break;
		case 9:
			System.out.println("júnior master");
			break;
		case 10:
			System.out.println("master");
			break;
		default:
			System.out.println("Aluno não registrado");
		}
	}
}