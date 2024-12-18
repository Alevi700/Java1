import java.util.Scanner;
public class MaximoComunDivisor {
	static double n;
	static int m;
	public static void main(String[] args) {
		entrada();
		double maximocomundivisior = calculo();
		System.out.println("El MCD es: " + maximocomundivisior);
	}
	public static void entrada() {
		
		Scanner sc = new Scanner (System.in); //entrada
		System.out.println("Introduzca 2 numeros n y m tal que n<m");
		System.out.println("Introduzca numero n");
		n = sc.nextInt();
		System.out.println("Introduzca numero m");
		m = sc.nextInt();
		sc.close();
		if (n>m) {
			System.out.print("Numeros no validos");
			System.exit(0);
		}

	}
    public static int calculo() {
    	double resto = m%n;
    	if (resto == 0) { //n es el MCD
    		return (int) n;
    	}
    	else {
    		m = (int) n;
    		n = (resto);
    		calculo(); //recursividad
    	}
    	return (int) n;
    }
}
