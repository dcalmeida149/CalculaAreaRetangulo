package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangulo _retangulo = new retangulo();
				
		System.out.println("Calcula area de um retangulo");
		System.out.print("Entre com a altura do retangulo: ");
		
		_retangulo.altura = sc.nextDouble();
		
		System.out.print("\n\nEntre com a largura do retangulo: ");
		_retangulo.largura = sc.nextDouble();
		
		System.out.print("\n\nResultados:");
		System.out.printf("\nArea: %.2f%n",_retangulo.area());
		System.out.printf("\nDiagonal: %.2f%n",_retangulo.diagonal());
		System.out.printf("\nPerimetro: %.2f%n",_retangulo.perimetro());
		
		sc.close();
		
	}

}
