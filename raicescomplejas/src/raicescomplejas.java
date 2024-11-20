import java.util.Scanner;
public class raicescomplejas {

	public static void main(String[] args) {
		double a,b,c,D,x1,x2,x1i,x2i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Las ecuaciones de segundo grado son e la forma ax^2 + bx + c = 0");
		System.out.println("Introduzca el coeficiente a");
		a = sc.nextDouble();
		System.out.println("Introduzca el coeficiente b");
		b = sc.nextDouble();
		System.out.println("Introduzca el coeficiente c");
		c = sc.nextDouble();
		D = Math.sqrt((b*b)-(4*a*c));
		if (D>0) {
			x1 = (-b+D)/(2*a);
			x2 = (-b-D)/(2*a);
			System.out.println("Las soluciones de su ecuación son: x1 =  " + x1 + "; x2 = " + x2);
		}else if (D==0) {
			x1 = (-b+D)/(2*a);
			System.out.println("Las solución de su ecuación es doble y es: x1 = " + x1 + " doble");
		}else{
			D = Math.sqrt(-(b*b-4*a*c));
			x1 = (-b)/(2*a);
			x1i = D/(2*a);
			x2i = -D/(2*a);
			System.out.println("Las soluciones de su ecuación no son reales y son: x1 = " + x1 + " + (" + x1i +")i ; x2 = " + x1 + " + (" + x2i + ")i" );
		}
		sc.close();
	}
}
