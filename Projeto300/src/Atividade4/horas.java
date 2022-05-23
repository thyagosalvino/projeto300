package Atividade4;
import java.util.Scanner;

public class horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tempo = new Scanner(System.in);
		int Segundos, H, M, S;
		
		System.out.println("Informe os segundos:");
		Segundos = tempo.nextInt();
		
		H= Segundos / 3600;
		M = (Segundos % 3600)/60;
		S = (Segundos % 3600)%60;
		
		System.out.println( H + " Horas, " + M + " Minutos " + " e " + S + " Segundos");
	}

}
