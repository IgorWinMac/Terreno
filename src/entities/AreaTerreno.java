package entities;

public class AreaTerreno {

	public double area;
	
	public void calcularArea(double largura, double comprimento) {
		area = largura * comprimento;
		System.out.println("O tamanho total da �rea � de: "+area+" metros.");
	}
}
