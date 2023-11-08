package retangulo;

public class Ret {
	public double base;
	public double altura;
	public double diagonal;

	public double area() {
		double ResulBase = base * altura;
		return ResulBase;
	}

	public double perimetro() {
		return 2 * (base + altura);
	}

	public double diagonal() {
		double diag = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		 return diag;
		
	}
}
