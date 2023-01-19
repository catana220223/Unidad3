/*Modifica el programa anterior para que se puedan guardar hasta 30 calificaciones. El programa pedirá calificaciones
al usuario hasta que éste introduzca una nota negativa (o se llene el array). El programa, además de lo requerido en
el ejercicio anterior, mostrará la nota máxima llamando a un método que se encargue de encontrarla.*/

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        double array[] = new double[30];




        NumeroAlumnos(array);
        PideNotas(array);
        System.out.println();
        MuestraNotas(array);
        System.out.println();
        MuestraSuspensos(array);
        System.out.println();
        MuestraMedia(array);
        System.out.println();
        MuestraMaxima(array);


    }

    public static void PideNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la nota: ");

            double aux = sc.nextDouble();


            if (aux >= 0 && aux <= 10) {
                array[i] = aux;


            } else {

                break;
            }

        }
    }


    public static void NumeroAlumnos(double[] array) {


        int numeroalumnos = 0;
        for (int i = 0; i < array.length; i++) {

            if (array [i] > 0);
            numeroalumnos++;
        }
    }



    public static void MuestraNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i] );

        }
    }

    public static void MuestraMedia(double[] array) {

        double media = 0.0;

        for (int i = 0; i < array.length; i++) {

            media = media + array[i];

        }

        media = media / array.length;

        System.out.printf("%.2f", media);

    }

    public static void MuestraMaxima(double[] array) {

        double max = 0;

        for (int i = 0; i < array.length; i++){

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("El maximo es: " +max);
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