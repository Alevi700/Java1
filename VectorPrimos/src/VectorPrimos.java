import java.util.Scanner;
public class VectorPrimos {
	
    public static void main(String[] args) {
    	int n;
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Cuántos numeros primos quieres almacenar?");
    	n = sc.nextInt();
    	sc.close();
    	int [] v = new int [n];
    	int contador = 0;
		int primo = 2;
		int i = 0;
    	while (contador < n) {
    		boolean esprimo = true;
    		for (int j = 2; j<primo; j++) {
    			if (primo%j == 0) {
    				esprimo = false;
    				break;
    			}
    		}
    		
    		if (esprimo) {
    			contador ++;
    			v[i] = primo;
    			i++;
    		}
    		
    		primo ++;
    	}
    	
    	for (int j = 0; j<n; j++) {
    		System.out.print(" " + v[j]);
    	}
    }
}
