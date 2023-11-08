package funcionario;

public class dadosFunc {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double aumento;
	public double total = salarioBruto + aumento;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
		
	}
	
	public double salarioComImposto() {
		aumento = (salarioBruto * 100) / total;
		return aumento
				
				
				;
	}

}
