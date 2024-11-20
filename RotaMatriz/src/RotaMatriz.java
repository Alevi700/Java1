import java.util.Scanner;
public class RotaMatriz {

	public static void main(String[] args) {
		int dimension;
		Scanner sc = new Scanner (System.in);
		System.out.println("¿De cuántas dimensiones quiere su matriz cuadrada?");
		dimension = sc.nextInt();
		int [][] v = new int [dimension][dimension];
		int [][] m = new int [dimension][dimension];
		System.out.println("Su matriz cuadrada generada es:");
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++ ) {
				v[i][j] = (int) (Math.random()*10);
				System.out.print(v[i][j] + " ");
				if (j == dimension - 1) {
					System.out.println();
				     }
			}
		}
		System.out.println("Su matriz rotada a la derecha es:");
		for (int i = 0; i<dimension; i++) {
			for(int j = 0; j<dimension; j++ ) {
				m[j][dimension-1-i] = v[i][j];
				
			}
		}
		
		for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
		sc.close();

	}
}

