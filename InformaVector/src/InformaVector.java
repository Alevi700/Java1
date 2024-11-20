import java.util.Scanner;
public class InformaVector {

	public static void main(String[] args) {
		int i;
		double m;
		m = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuál es el tamaño de su vector?");
		i = sc.nextInt();
		int [] v = new int[i];
		
		for (int j = 0; j<i; j++) {
		v [j] = (int) (Math.random()*100-1);
		}
		
		System.out.println("Su vector generado es el siguiente:");
		for (int k = 0; k<i; k++) {
			System.out.println(v[k]);
		}
		
		for (int k = 0; k<i; k++) {
			m = (double) v[k]/i + m;
			if (k == i - 1) {
				System.out.printf("La media de los valores de su vector es: %.2f ", m);
				break;
			}
		}
		int mayor = v[0];
		int posicion = 0;
		for (int j = 0; j<i; j++) {
			if (v[j] > mayor) {
				mayor = v[j];
				posicion = j;
			}
		}
		System.out.println();
		System.out.println("El elemento mayor es es el: " + mayor);
		System.out.println("Su posicion es: " + posicion);
		
		int rep = v[ (int) (v.length*Math.random())];
		int maxrep = 0;
		for(int j = 0; j< v.length; j++) {
			int contador = 0;
			for (int k = 0; k<v.length; k++) {
				if (v[j] == v[k]) {
					contador ++;
				}
			}
			if (contador > maxrep) {
				maxrep = contador;
				rep = v[j];
			}
	    }
		System.out.println("El numero mas repetido es: " + rep + "(reptido " + maxrep + " veces)");
		sc.close();
	}
}
