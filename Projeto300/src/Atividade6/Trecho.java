package Atividade6;

import java.util.Scanner;

public class Trecho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
				
		int a, b, c, aux;
		 System.out.println(" Digite 3 numeros: ");
		 a=ler.nextInt();
		 b=ler.nextInt();
		 c=ler.nextInt();
		 
		if (a > b) {
		      aux = a;
		      a = b;
		      b = a;
		}
		if (a > c) {
		    aux = a;
		    a = c;
		    c = aux;
		}
		if (b > c) {
		     aux = b;
		     b = c;
		     c = aux;
		}
		System.out.println("Ordem crescente :" + a + "," + b +","+ c);
	}

}
