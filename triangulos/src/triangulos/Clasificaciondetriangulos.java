/* 
* Grupo: Lab_Axx 
* Miembro 1: Alejandro Vicioso Oviedo 
* Miembro 2: Balter Manuel Castillo Cuevas 
* Fecha: 11/11/2024
* Descripción: Programa que cuenta los numeros primos que hay entre el 1 y un numero p
* Versión: 1.0 */
package triangulos;
import java.util.Scanner;
public class Clasificaciondetriangulos {

	public static void main(String[] args) {
	double A,B,C;
	Scanner sc = new Scanner (System.in);
	System.out.println("¿Cual es la longitud en metros del lado A? ");
	A = sc.nextDouble();
	System.out.println("¿Cual es la longitud en metros del lado B? ");
	B = sc.nextDouble();
	System.out.println("¿Cual es la longitud en metros del lado C? ");
	C = sc.nextDouble();
	if (A==B && B==C) {
		System.out.println("El triangulo es equilatero");	
	}else if ((A==B || A==C || B==C) && (A+B>C && A+C>B && B+C>A)) {
		System.out.println("El triangulo es isósceles");
	}else if ((A+B>C && A+C>B && B+C>A) && (A != B && B != C && A !=C)) {
		System.out.println("El triangulo es escaleno");
	}else {System.out.println("El triangulo no es valido");
	}	
	sc.close();
	}
}
