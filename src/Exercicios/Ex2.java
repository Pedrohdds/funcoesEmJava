package Exercicios;

import java.util.Locale;
import java.util.Scanner;
import funcionario.dadosFunc;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		dadosFunc A;
		A = new dadosFunc();
		
		System.out.println("Digite o nome do funcionario");
		A.nome = sc.next();
		
		System.out.println("Digite o salario Bruto");
		A.salarioBruto = sc.nextDouble();
		
		System.out.println("Digite o valor do imposto");
		A.imposto = sc.nextDouble();
		
		double salarioLiquido = A.salarioLiquido();
		System.out.printf("Funcionario: " + A.nome + ", " + salarioLiquido);
		
		System.out.println("");
		
		double salarioComImposto = A.salarioComImposto();
		
		System.out.println("Quanto deseja aumentar do salario em %? :");
		A.aumento = sc.nextDouble();
		
		System.out.printf("update de Funcionario: " + A.nome + ", " + salarioComImposto);
		
		
		
		
		sc.close();
		
		
	}

}
