package prj_Switchcase;

import java.util.Scanner;

public class Signo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d, m;
		System.out.println("Digite o dia de seu nascimento:");
		d = in.nextInt();
		System.out.println("Digite o mês de seu nascimento:");
		m = in.nextInt();
		switch(m) {
		case 1:
			if (d>= 21 && d <= 30) {
			 System.out.println("Seu signo é Aquário");
			} else if (d>= 32) {
				 System.out.println("invalido");
			}else
				System.out.println("Seu signo é capricórnio");
			break;
		case 2:
			if (d>= 1 && d <= 19) {
			 System.out.println("Seu signo é peixes");
			} else if (d>= 30) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Aquário");
			break;
		case 3:
			if (d>= 1 && d <= 20) {
			 System.out.println("Seu signo é peixes");
			} else if (d>= 32) {
				 System.out.println("dia invalido");
			} else
				System.out.println("Seu signo é Áries");
			break;
		case 4:
			if (d>= 1 && d <= 20) {
			 System.out.println("Seu signo é Áries");
			} else if (d>= 31) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Touro");
			break;
		case 5:
			if (d>= 1 && d <= 20) {
			 System.out.println("Seu signo é Touro");
			} else if (d>= 32) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Gêmeos");
			break;
		case 6:
			if (d>= 1 && d <= 20) {
			 System.out.println("Seu signo é Gêmeos");
			} else if (d>= 31) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Câncer");
			break;
		case 7:
			if (d>= 1 && d <= 21) {
			 System.out.println("Seu signo é Câncer");
			} else if (d>= 32) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Leão");
			break;
		case 8:
			if (d>= 1 && d <= 22) {
			 System.out.println("Seu signo é Leão");
			} else if (d>= 32) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Virgem");
			break;
		case 9:
			if (d>= 1 && d <= 22) {
			 System.out.println("Seu signo é Virgem");
			} else if (d>= 31) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Libra");
			break;
		case 10:
			if (d>= 1 && d <= 22) {
			 System.out.println("Seu signo é Libra");
			} else if (d>= 32) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Escorpião");
			break;
		case 11:
			if (d>= 1 && d <= 21) {
			 System.out.println("Seu signo é Escorpião");
			} else if (d>= 31) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Sagitário");
			break;
		case 12:
			if (d>= 1 && d <= 21) {
			 System.out.println("Seu signo é Sagitário");
			} else if (d>= 32) {
				 System.out.println("invalido");
			} else
				System.out.println("Seu signo é Capricórnio");
			break;
			default:
				System.out.println("Esta data não existe");
		}
	}
}
