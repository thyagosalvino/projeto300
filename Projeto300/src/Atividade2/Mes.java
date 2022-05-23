package Atividade2;
 
import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ent = new Scanner(System.in);
		
		int Mess;
		String [] Mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		System.out.println("Digite um numero entre 1 à 12: ");
		Mess=Ent.nextInt();
		System.out.println(Mes[Mess-1]);
		

	}

}
