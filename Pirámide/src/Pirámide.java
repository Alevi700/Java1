import java.util.Scanner;
public class Pirámide {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("¿De cuántos niveles quieres la pirámide?");
		n = sc.nextInt();
		for (int i = 0;i<n;i++) {
			for (int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}for(int k = 0;k<=2*i;k++) {
			System.out.print("*");
			} System.out.println();
		}
		sc.close();
	}

}
