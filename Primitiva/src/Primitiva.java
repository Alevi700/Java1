import java.util.Scanner;
public class Primitiva{
	static int apuesta;
	public static void main (String [] args) {
		
		entrada();
		
		
		int [] boleto = new int [6];
		int [] premiado = new int [6];
		int [][] listaboletos = new int [apuesta][6];

		for(int i = 0; i<apuesta; i++) {
			boleto = generarboleto();
			listaboletos = guardarboleto(boleto,listaboletos,i);
		}
		
		imprimirboletos(listaboletos);
		
		premiado = generarboleto();
		
		salida(premiado, listaboletos);

	}
	public static void entrada() {
		int dinero;
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el importe (Cada apuesta vale 1 €)");
		dinero = sc.nextInt();
		
		System.out.print("¿Cuántas apuestas desea realizar?");
		apuesta = sc.nextInt();
		
		if (dinero == apuesta) {
			System.out.print("Usted ha realizado " +  apuesta + " apuestas");
		}
		else if (apuesta <= 0 || apuesta > dinero) {
			System.out.print("Apuesta no válida");
			System.exit(0);
		}
		else {
			System.out.print("Usted ha realizado " + apuesta + " apuestas, le corresponde " + (dinero - apuesta) + "€ de cambio" );
		}
		sc.close();
	}
	public static int [] generarboleto() {
		int [] b = new int [6];
		boolean valido = true;

		do {
		valido = true;
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random()*49)+1;
			
		   }
		
		for (int i = 0; i< b.length; i++) {
			for(int j = i+1; j< b.length; j++) {
				if(b[i] == b[j]) {
					valido = false;
				   }
			   }
		   }
		}while(valido == false);
		
		return b;
		
	}
	public static void imprimirboletos(int [][] listaboletos) {
		System.out.println();
		System.out.println("Sus boletos son: " );
		for (int i = 0; i<apuesta;  i++) {
			for(int j = 0; j<6; j++) {
			System.out.print(listaboletos[i][j] + " ");
			if (j == 5) {
				System.out.println();
			    }
			}
		}
	}
	public static int[][] guardarboleto(int [] guardar, int [] [] listaboletos , int indice){
		for (int i = 0; i<6; i++) {
			listaboletos [indice][i] = guardar[i];
		}
		return listaboletos;
	}
		public static int comprobarboleto (int [][]listaboletos, int [] premiado, int indice){
		int contador = 0;
			for (int j = 0 ; j<6; j++) {
				for (int k = 0; k<6; k++) {
				if (listaboletos[indice][j] == premiado [k]) {
				contador ++;
				}
				}
				
			} 			
		return contador;
	}
	public static void salida(int [] premiado, int [][] listaboletos) {
		int aciertos;
		for (int indice = 0; indice<apuesta; indice++) {
		aciertos = comprobarboleto(listaboletos, premiado, indice);
		System.out.println("Su boleto " + (indice+1) + " tiene " + aciertos + "aciertos");
		if (aciertos >= 3) {
		switch(aciertos){
		case 3: 
			System.out.println("Usted ha ganado 10€");
			break;
		case 4:
			System.out.println("Usted ha gandado 500€");
			break;
		case 5:
			System.out.println("Usted ha ganado 10000€");
			break;
		case 6:
			System.out.println("Usted ha ganado 1000000€");
			break;
		default:
			break;
		    }
		}
		else {
			int reintegrop, reintegro;
			reintegro = (int) (Math.random()*9) + 1;
			reintegrop = (int) (Math.random()*9) + 1;
			if(reintegro == reintegrop) {
				System.out.println("Usted ha recuperado 1€ de su boleto: " + (indice+1));
			}
		
		}
		}
	}
}