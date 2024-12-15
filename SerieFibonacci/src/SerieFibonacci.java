import java.util.Scanner;
public class SerieFibonacci {
	
	public static void main(String[] args) {
		int n = 0;
		n = entrada(n);
		long p = 0;
		long s = 1;		
		int contador = 3;
		long resultado = calculo(n,p,s,contador);
		System.out.print("El termino " + n + "de la serie de Fibomacci es: " + resultado);


	}
	public static int entrada(int n) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el termino n de la serie de Fibonacci que quieras obtener: ");
		n = sc.nextInt();
		sc.close();
		if (n<0) {
			System.out.print("Número no valido");

			System.exit(0);
		}
		return n;
	}
	public static long calculo(int contadorserie, long p, long s, int contador) {
		long serie = p + s;
		if (contadorserie > contador) {
			p = s;
			contador++;
			s = serie;
			serie = calculo(contadorserie,p,s,contador);
		}
		return serie;
	}

}
