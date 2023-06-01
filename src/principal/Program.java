package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		AreaTerreno area = new AreaTerreno();
		
		System.out.println("Digite aqui a largura: ");
		double largura = entrada.nextDouble();
		
		System.out.println("Digite aqui o comprimento: ");
		double comprimento = entrada.nextDouble();
		
		System.out.println(area.calcularArea(largura, comprimento));
		
		entrada.close();

	}

}
