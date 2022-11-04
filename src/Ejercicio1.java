//Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso, es decir,
// el primero que se introduce es el último en mostrarse y viceversa.


import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 numeros:");

        for (int i =0;i<10;i++) {
            System.out.print("Número "+(i+1)+": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Numeros al reves");
        for (int i=9; i>=0;i--) {
            System.out.println("Numero " + (i+1)+": "+numeros[i]);
        }
    }
}