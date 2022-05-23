package Atividade8;

import java.util.Scanner;

public class IdadeEleicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println(" Informe sua idade: ");
		idade=ler.nextInt();
		
		if(idade<16){
			System.out.println("Não pode votar; ");
		}
	
		else if (idade>=18 && idade<=65){
			System.out.println("Obrigatório ");
		}
		
		else if(idade>65)
			System.out.println("Facultativo ");
	}
		

}


