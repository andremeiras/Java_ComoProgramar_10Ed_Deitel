package exercicios;
// Programa para calcular o IMC de uma pessoa. 
// A fórmula é: IMC = pesoEmQuilogramas / alturaEmMetros²

import java.util.Scanner;

public class CalculadoraIMC {
	
	public static void main(String[] args) {
		double pesoEmQuilogramas;
		double alturaEmMetros;
		double imc;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu peso(Kg): ");
		pesoEmQuilogramas = input.nextDouble();
		
		System.out.print("Digite sua altura em metros (Ex: 1,75): ");
		alturaEmMetros = input.nextDouble();
		
		imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		System.out.println("Seu IMC: " + imc);
		
		if (imc < 18.5) 
			System.out.println("Abaixo do peso (Underweight)");
		
		if (imc >= 18.5 && imc <= 24.9) 
			System.out.println("Peso Normal");
		
		if (imc >= 25 && imc <= 29.9)
			System.out.println("Acima do peso (Overwight)");
		
		if (imc >= 30)
			System.out.println("Obeso");
	}	
}
