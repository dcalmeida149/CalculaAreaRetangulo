package entities;

public class retangulo {
	public double altura, largura;
	
	public double area(){
		return altura * largura;
	}
	public double perimetro() {
		return 2 * (altura * largura);
	}
	public double diagonal(){
		return Math.sqrt(largura * largura + altura * altura);
	}
}
