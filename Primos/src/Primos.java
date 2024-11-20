import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		int n;
		boolean a = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su numero: ");
		n = sc.nextInt();
		if (n == 1) {
			sc.close();
			System.out.println("Su numero no es primo");
		}
		else {
		for(int i = 2;n>i;i++) {
			if(n%i == 0) {
				a = false;
				break;
			}
		}
		if (a == true) {
			System.out.println("Su número es primo");}
		else {
			System.out.println("Su número no es primo");
			}		
		}
		sc.close();
		}
	}

