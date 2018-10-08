package edu.java.conversor;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o dia");
		int dia = scan.nextInt();
		System.out.println("Digite o mês:");
		int mes = scan.nextInt();
		System.out.println("Digite o ano");
		int ano = scan.nextInt();
		Conversor conv = new Conversor();
		System.out.println(conv.conversorData(dia, mes, ano));
	}

}
