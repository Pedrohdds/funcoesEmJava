import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = Math.sqrt(25.0); // Passa a raiz quadrada do argumento (25.0)

		System.out.println("Digite 3 numeros");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);

		showResult(higher);
		sc.close();
	}

	// declarando uma função
	public static int max(int x, int y, int z) {

		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher " + value);
	}
}
