package entities;

public class AreaTerreno {

	public double area;
	
	public String calcularArea(double largura, double comprimento) {
		area = largura * comprimento;
		return "O tamanho total da área é de: "+area+" metros.";
	}
}
