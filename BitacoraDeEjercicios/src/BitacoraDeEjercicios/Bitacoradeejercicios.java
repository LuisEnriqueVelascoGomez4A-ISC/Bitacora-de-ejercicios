package BitacoraDeEjercicios;
/**
 * @author 
 * Velasco Gómez Luis Enrique - 19070037 
 * Mena Gónzalez Daniel Ricardo - 19070021
 * Canche Chacón Andrea Guadalupe - 19070055
 * 4A-ing. Sistemas computacionales
 */
import java.util.Scanner;
public class Bitacoradeejercicios {
    public static double discriminante;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("        Euler            ");
        System.out.print("\n**********************\n");
                    double Euler = 0;
                    System.out.print("Ingrese el valor de x: ");
                    int x = teclado.nextInt();
                    System.out.print("Ingrese el valor de y: ");
                    int y = teclado.nextInt();
                    for (int j = 0; j <= y; j++) {
                       Euler += (Math.pow(x, j) / Factorial(j));
                    }
                    System.out.println("");
                    System.out.println("El resultado de euler elevado a " + x + " es: " + Euler);
                    System.out.println("El resultado de euler elevado a -" + x + " es: " + (1 / Euler));
                    System.out.print("");
        System.out.print(" Ecuación cuadratica  ");
        System.out.print("\n**********************\n");
                    System.out.print("");
                    System.out.print("Ingrese el valor de a: ");
                    int a = teclado.nextInt();
                    System.out.print("Ingrese el valor de b: ");
                    int b = teclado.nextInt();
                    System.out.print("Ingrese el valor de c: ");
                    int c = teclado.nextInt();
                    discriminante = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
                    ecuacion1(a, b, c);
                    ecuacion2(a, b, c);
    }
  
    

    public static double Factorial(int n) {
        double cont = 1;
        for (int i = 1; i <= n; i++) {
            cont *= i;
        }
        return cont;
    }

    public static void ecuacion1(int a, int b, int c) {
        double x1 = 0, x2 = 0;
        if (discriminante > 0) {
            x1 = (-b + discriminante)/(2*a);
            x2 = (-b - discriminante)/(2*a);
        } else if (discriminante == 0) {
            x1 = (-b + Math.sqrt(discriminante))/(2*a);
            x2 = x1;
        }
        System.out.println("\nPrimer Metodo de Solucion:");
        impresion(x1, x2);
    }
    
    public static void ecuacion2(int a, int b, int c) {
        double x1 = 0, x2 = 0;
        if (discriminante > 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = (-2 * c) / (b - discriminante);
        } else if (discriminante == 0) {
            x1 = (-2 * c) / (b + discriminante);
            x2 = x1;
        }
        System.out.println("\nSegunda solución:");
        impresion(x1, x2);
    }
    
    public static void impresion(double x1, double x2) {
        if (discriminante >= 0) {
            System.out.println("El resultado de x1 es " + x1);
            System.out.println("El resultado de x2 es " + x2);
        } else {
            System.out.println("No existe solucion");
        }
    }
}