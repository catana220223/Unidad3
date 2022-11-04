//Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes de una clase y
// los guarde en un array. Después, mostrará esas calificaciones (cada una en una línea), seguida de la media del curso
// y del número de aprobados y suspensos. Se usará un método para calcular la nota media y otro para el número de suspensos.

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        double array[] = new double[10];

        PideNotas(array);
        MuestraNotas(array);
    }




    public static void PideNotas(double [] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la nota: ");
            array[i] = sc.nextDouble();
        }
    }




    public static void MuestraNotas(double [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }





}

