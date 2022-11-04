//Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las
// palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.


import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        PideNumeros(numeros);
        MuestraNumeros(numeros);
    }




    public static void PideNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce numero: ");
             array[i] = sc.nextInt();
        }
    }




    public static void MuestraNumeros(int[] array){

        int aux = 6;

        for (int i = 0 ; i <= 9 ; i++){
            System.out.println(array[i]);
        }
        if (array [0] > array[1]) {
            aux = array [0];
        }else
            System.out.println("El máximo es: " +aux);

    }
}

