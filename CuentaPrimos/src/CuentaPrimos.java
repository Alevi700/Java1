/* 
* Grupo: Lab C07
* Miembro 1: Alejandro Vicioso Oviedo 
* Miembro 2: Balter Manuel Castillo Cuevas 
* Fecha: 11/11/2024
* Descripción: Programa que cuenta los numeros primos que hay entre el 1 y un numero p
* Versión: 1.0 */
import java.util.Scanner;
public class CuentaPrimos {

	public static void main(String[] args) {
		int p,contador; 
		contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su número");
		p = sc.nextInt();
		for (int n = 2; n<=p; n++) { 
			boolean primo = true;
			for (int i = 2; (n-1)>=i; i++ ) {
				if (n%i == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				++contador;
				System.out.print(n + " ");
			}
		}
		System.out.println("\n La cantidad de numeros primos entre 1 y " + p + " son " + contador);
		sc.close();
	}
}