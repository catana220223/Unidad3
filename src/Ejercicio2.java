//Define un array de 12 números y asigna valores a los elementos según la tabla que se muestra a continuación.
// Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?.
// Indica la respuesta en forma de comentario.


import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros=new int[12];
        numeros [0] = 39;
        numeros [1] = -2;
        numeros [4] = 0;
        numeros [6] = 14;
        numeros [8] = 5;
        numeros [9] = 120;

        for(int i=0;i<numeros.length;i++)
        {
            System.out.println(numeros[i]);
        }
    }
}
//RESPUESTA: LOS VALORES NO INICIALIZADOS APARECEN COMO 0
