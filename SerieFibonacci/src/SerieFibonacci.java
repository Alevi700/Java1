import java.util.Scanner;
public class SerieFibonacci {
	
	public static void main(String[] args) {
		int n = 0;
		//hacemos la entrada del termino que se quiere de la serie
		n = entrada(n);
		long p = 0; //primer termino
		long s = 1;	// segundo termino	
		int contador = 2;//posicion en la que estamos, como estamos en la posicion 2 pues contador en 2
		long resultado = calculo(n,p,s,contador);
		System.out.printf("El termino " + n + " de la serie de Fibonacci es: " + resultado);

		

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
		long serie = p + s; //es el tercer termino
		if (contadorserie == 0) {
			return 0;
		}
		if (contadorserie > contador) { //aqui se adelantan los terminos en 1 posicion y se realiza la recurdividad actualizando terminos
			p = s;
			contador++;
			s = serie;
			serie = calculo(contadorserie,p,s,contador);
		}
		return serie;
	}

}
