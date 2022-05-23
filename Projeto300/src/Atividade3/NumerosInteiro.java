package Atividade3;

public class NumerosInteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 360, numeroInvertido=0;
		while(numero>0) {
			
		numeroInvertido = numeroInvertido + (numero % 10);
		numeroInvertido = numeroInvertido *10;
		numero = numero/10;
		}
		System.out.println(numeroInvertido);

	}

}
