package Ativadade7;
import java.util.Scanner;

public class Triangilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ladoA = new Scanner(System.in);
		Scanner ladoB = new Scanner(System.in);
		Scanner ladoC = new Scanner(System.in);
		int LadoA, LadoB, LadoC;
		
		System.out.println("Informe o Lado A:");
		LadoA = ladoA.nextInt();
		System.out.println("\nInforme o Lado B: ");
		LadoB = ladoB.nextInt();
		System.out.println("\nInforme o Lado C: ");
		LadoC = ladoC.nextInt();
		
		if(LadoA + LadoB >= LadoC && LadoA + LadoC >= LadoB && LadoB + LadoC >= LadoA) {
			System.out.println("Triangulo");
		}
		else
			System.out.println(" Não e um Triangulo ");

	}

}
