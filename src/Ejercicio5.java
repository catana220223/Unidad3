//Define tres arrays de 20 números enteros cada uno, con nombres: numero, cuadrado y cubo.
// Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
// cuadrados de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos de los valores
// que hay en numero. A continuación se muestra el contenido de los tres arrays dispuestos en tres columnas.

import java.sql.SQLOutput;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        LlenaArray(numero);
        MuestraArray(numero);
        ArrayCuadrado(cuadrado , numero);
        MuestraArray(cuadrado);
        ArrayCubo(cubo , numero);
        MuestraArray(cubo);

    }

    public static void LlenaArray(int[] numero) {
        for (int i = 0; i < numero.length ; i++) {
            numero[i] = (int) (Math.random() * 101) ;
        }
    }

    public static void ArrayCuadrado(int[] cuadrados , int [] numeros) {
        for (int i = 0; i < numeros.length ; i++) {
            cuadrados[i] = numeros [i] * numeros [i] ;
        }
    }

    public static void ArrayCubo(int[] cubos , int [] numeros) {
        for (int i = 0; i < numeros.length ; i++) {
            cubos[i] = numeros [i] * numeros [i] * numeros [i] ;
        }
    }
    public static void MuestraArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}