package exercicio3;

public class Exercicio3 {
	public static void main(String args[]){
		double num = 2;
		double pot = 3;
		double potencia = Potencia.potencia(num, pot);
		System.out.println(potencia);
		
		potencia = Potencia.potencia(-num, pot);
		System.out.println(potencia);
		
		potencia = Potencia.potencia(num, -pot);
		System.out.println(potencia);
		
		potencia = Potencia.potencia(-num, -pot);
		System.out.println(potencia);
		
		potencia = Potencia.potencia(-num, 2);
		System.out.println(potencia);
		
		potencia = Potencia.potencia(-num, -2);
		System.out.println(potencia);
	}
}
