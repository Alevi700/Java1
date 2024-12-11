package manejaFichero;

import java.io.*;
import java.util.Scanner;
public class manejaFichero {
	public static void main (String[] args) throws IOException {
		File fichero;
		PrintWriter salida;
		String nombrefich;
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el nombre de su archivo de texto: ");
		nombrefich = sc.next() + ".dat";
		
		fichero = new File(nombrefich);
		salida = new PrintWriter(new FileWriter(fichero));
		//abrimos y rellenamos el archivo con el alias metido con un escaner y le damos una puntuacion
		boolean masalias = false;
		do {			
			System.out.print("Escriba su alias: ");
			String alias = ">" + sc.next() + ";";
			int puntuacion = (int) (Math.random()*1000000);
			salida.println(alias + puntuacion);
			System.out.println("¿Desea ingresar más alias?(s/n)");
			masalias = sc.next().equals("s");			
		}while(masalias);
		sc.close();
		salida.close();
		//abrimos el fichero y leemos el numero de lineas que hay en el archivo
		Scanner leerfichero = new Scanner (fichero);
		int filas = 0;
		int i = 0;
		
		while(leerfichero.hasNextLine()) {
			leerfichero.nextLine();
			filas++;
		}
		//alistamos todos los datos en una matriz con el numero de filas del archivo y 2 columnas, en la primera el alias y la segunda la puntuacion
		String [][] aliasdatos = new String[filas][2];
		leerfichero.close();
		Scanner leerfichero2 = new Scanner (fichero);
		while(leerfichero2.hasNextLine()) {
					String recorrelineas = leerfichero2.nextLine();
					String [] datos = recorrelineas.split(";");
					for (int j = 0 ; j<2; j++) {
						if(j == 0){
							aliasdatos [i][j] = datos[0];
						}
						else {
							aliasdatos [i][j] = datos [1];
						}
					}
					
					i++;								
		}
		
		//pasamos la puntuacion de forma de numero string a numero entero usando Integer.parseInt y lo colocamos en un vector
		leerfichero2.close();
		int [] puntuaciones = new int [filas];
		for(int indice = 0; indice<filas; indice ++) {
			puntuaciones [indice] = Integer.parseInt(aliasdatos[indice][1]);
		}
		//encontramos la puntuacion mayor
		int puntuacionmayor = 0;
		for (int indice = 0; indice<filas; indice++) {
			for(int j = 0; j<filas; j++) {
				if (puntuaciones[indice] < puntuaciones[j]) {
					puntuacionmayor = puntuaciones[j];
				}
			}
		}
		//localizamos la puntuacion mayor
		int posicion = 0;
		for (int indice = 0; indice<filas; indice++) {
			if (puntuacionmayor == puntuaciones[indice]) {
				posicion = indice;
			}
		}
		//imprimimos
		for (int indice = 0; indice<filas; indice++) {
			for(int j = 0; j<2; j++) {
				if (j == 1) {
					System.out.print("=");
				}
				System.out.print(aliasdatos[indice][j]);
				}
				System.out.println();
			} 
			System.out.println ("El usuario con mayor puntuacion es: " + aliasdatos[posicion][0] + " = " + puntuacionmayor);

		}
}
		