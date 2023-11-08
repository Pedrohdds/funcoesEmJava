package Exercicios;

import java.util.Locale;
import java.util.Scanner;
import retangulo.Ret;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Ret a;
		a = new Ret();
		
		System.out.println("Digite a base e altura do retangulo");
		a.base = sc.nextDouble();
		a.altura = sc.nextDouble();
		
		double alturaRet = a.area();
		System.out.println("A area do retangulo é: "+ alturaRet);
		
		double perimetroRet = a.perimetro();
		System.out.println("O perimetro é: " + perimetroRet);
		
		double diagonalRet = a.diagonal();
		System.out.println("A diagonal é: " + diagonalRet);
		
		
		
		sc.close();

	}

}
