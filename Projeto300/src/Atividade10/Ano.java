package Atividade10;
import java.util.Scanner; 
public class Ano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler=new Scanner(System.in);
		
		int dia, mes, ano, i; 
		int ndias;
		int [] meses  = new int[12];
		meses [0]= (31);
		meses [1]= (28);
		meses [2]= (31);
		meses [3]= (30);
		meses [4]= (31);
		meses [5]= (30);
		meses [6]= (31);
		meses [7]= (31);
		meses [8]= (30);
		meses [9]= (31);
		meses [10]= (30);
		meses [11]= (31);
		

		System.out.println("\n\n ----Contador de dias----- \n");

		do
		   {
			System.out.println("\nDia: ");
		   dia=ler.nextInt();
		   } while ((dia > 31) || (dia < 1));
		do
		   {
			System.out.println("\nMes: ");
		   mes=ler.nextInt();
		   } while ((mes > 12) || (mes < 1));
		do
		   {
			System.out.println("\nAno: ");
		   ano=ler.nextInt();
		   } while ((ano < 1900) || (ano > 2100));

			ndias = 0;

		if ( ((ano%4) == 0) && ((ano%100) != 0) || (ano%400 == 0)) 

		ndias += dia;

		for (i=0; i< (mes-1); i++)
		  ndias += meses[i];

		System.out.printf("\nDia Numero: %ld", ndias);
		}
		 

	}


