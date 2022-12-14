//Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes de una clase y
// los guarde en un array. Después, mostrará esas calificaciones (cada una en una línea), seguida de la media del curso
// y del número de aprobados y suspensos. Se usará un método para calcular la nota media y otro para el número de suspensos.

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        double array[] = new double[10];

        PideNotas(array);
        System.out.println();
        MuestraNotas(array);
        System.out.println();
        MuestraSuspensos(array);
        System.out.println();
        MuestraMedia(array);
    }




   /*public static void PideNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la nota: ");

            double aux = sc.nextDouble();


            if (aux >= 0 && aux <= 10) {



            } else {

                System.out.println("Numero introducido no valido");
            }

        }
    }
    */



    public static void PideNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la nota: ");


            if (array[i] >= 0 || array[i] <= 10) {
                array[i] = sc.nextDouble();

            } else {

                System.out.println("Numero introducido no valido");
            }

        }
    }


    public static void MuestraNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void MuestraMedia(double[] array) {

        double media = 0.0;

        for (int i = 0; i < array.length; i++) {

            media = media + array[i];

        }
        media = media / array.length;

        System.out.printf("La media del curso es: " + "%.2f", media);

    }

    public static void MuestraSuspensos(double[] array) {
        int aprobados = 0;

        int suspensos = 0;

        for (int i = 0; i < array.length; i++) {


            if (array[i] < 5) {

                suspensos++;

            } else {
                aprobados++;

            }
        }

        System.out.println("Han aprobado " + aprobados + " personas y han suspendido " + suspensos + " personas");

    }
}

