package ficheroPrimo;
import java.io.*;
import java.util.Scanner;
public class ficheroPrimo {
	static File fichero2000 = new File ("fichero2000.dat");
	static File ficheroprimos = new File ("ficheroprimos.dat");
	public static void main(String[] args) throws IOException{
		generarfichero2000();
		leerfichero2000();
	}
	
	public static File generarfichero2000() throws IOException{
		PrintWriter salida = new PrintWriter(new FileWriter(fichero2000));
		
		for(int i = 0; i <2000; i++) {
			int n = (int) (Math.random()*1000000);
			salida.print(n + " ");
		}
		
		salida.close();
		return fichero2000;
	}
    public static void leerfichero2000() throws IOException{
		Scanner leerarchivo2000 = new Scanner (fichero2000);
		PrintWriter salidaprimos = new PrintWriter(new FileWriter (ficheroprimos));
		while(leerarchivo2000.hasNextInt()) {
			int posibleprimo = leerarchivo2000.nextInt();
			if(esprimo(posibleprimo)){
				salidaprimos.print(posibleprimo + " ");
			}
		}
		salidaprimos.close();
		leerarchivo2000.close();
    }
    public static boolean esprimo(int posibleprimo) {
    	boolean esprimo = true;
    	for (int i = 2; i<Math.sqrt(posibleprimo); i++) {
    		if(posibleprimo%i == 0) {
    			esprimo = false;
    		}
    	}
    	return esprimo;
    }

}
