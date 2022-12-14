//Escribe un programa que lea 15 números por teclado y los almacene en un array. Rota los elementos de ese array,
// es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc.
// El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.


import java.util.Scanner;

public class Ejercicio7 {


    public static int[] array = new int[15];
    public static int[] rotados = new int[15];

    public static void main(String[] args) {


        PideNumeros(array);
        RotaNumeros(array);
        MuestraNumeros(rotados);


    }

    public static void PideNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el siguiente numero: ");
            array[i] = sc.nextInt();
        }
    }

    public static void RotaNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (i == 14) {
                rotados[i] = array[0];
            } else rotados[i] = array[i + 1];
        }
    }


    public static void MuestraNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");
        }
    }

}
