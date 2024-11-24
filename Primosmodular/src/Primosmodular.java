import java.util.Scanner;
public class Primosmodular {

	public static void main(String[] args) {
		int n;
		System.out.println("¿Cuántos numeros primos quieres mostrar?");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		listarnprimos(n);
		sc.close();

	}
	public static void listarnprimos(int n) {
		int contador = 0;
		for (int i = 2; contador<n; i++) {
			if(esprimo(i)) {
				contador ++;
				System.out.print(" " + i);
			}
		}
	}
	public static boolean esprimo(int primo) {
		boolean esprimo = true;
		for (int i = 2; i<primo; i++) {
			esprimo = true;
			if (primo%i == 0) {
				esprimo = false;
				break;
			}
		}
		return esprimo;
	}

}
