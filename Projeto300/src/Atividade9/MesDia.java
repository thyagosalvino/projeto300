package Atividade9;

import java.util.Scanner;

public class MesDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LerVar = new Scanner(System.in)) {
			

		    int dd,mm,yy;

		    System.out.println("informe o dia, mes e o ano: ");
		    dd=LerVar.nextInt();
		    mm=LerVar.nextInt();
		    yy=LerVar.nextInt();

		    //check year
		    if (yy >= 1900 && yy <= 9999)
		    {
		        //check month
		        if (mm >= 1 && mm <= 12)
		        {
		            //check days
		            if ((dd >= 1 && dd <= 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12))
		            	 System.out.println("Essa data e valida");
		            else if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11))
		            	 System.out.println("Essa data e valida.\n");
		            else if ((dd >= 1 && dd <= 28) && (mm == 2))
		            	 System.out.println("Essa data e valida.\n");
		            else if (dd == 29 && mm == 2 && (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)))
		                System.out.println("Essa data e valida.\n");
		            else
		            	 System.out.println("Data invalida.\n");
		        }
		        else
		        {
		        	 System.out.printf("o mes não e valido.\n");
		        }
		    }
		    
		}

	}

}
		 


