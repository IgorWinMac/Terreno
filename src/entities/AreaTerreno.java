package entities;

public class AreaTerreno {

	public double area;
	
	public String calcularArea(double largura, double comprimento) {
		area = largura * comprimento;
		return "O tamanho total da �rea � de: "+area+" metros.";
	}
}
