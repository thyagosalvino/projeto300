package Aividade1;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ler = new Scanner(System.in);
		
		float [] Nota = new float[10];
		
		float Soma=0, Media;
		
		for(int i=0;i<10;i++) {
			System.out.println(" Informe a sua notas ? ");
			Nota[i] = Ler.nextFloat();
			
			Soma = Soma + Nota[i];
			
		}
		Media=Soma/10;
		System.out.printf("A Media da nota é %.2f" , Media);

	}

}
