
package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
      solucion();
    }
    
    public static void solucion() {
        int fin = Integer.parseInt(JOptionPane.showInputDialog("SERIE DE FIBONACCI \n Ingrese el numero final de la serie: "));
        int n1 = 0, n2 = 1, suma = 1, i=1;
       
        System.out.print("La serie Fibonacci es: \n"+n1+", ");

        while (suma<=fin) { 
           System.out.print(suma+", ");
           suma =  n1+n2;
           n1 = n2;
           n2 = suma;
           i++;
        }
    }
}
