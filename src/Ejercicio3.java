//Crea un programa que permita almacenar en un array un conjunto de 20 números enteros de valores comprendidos
// entre 0 y 99 generados aleatoriamente (utiliza el método Math.random()).



public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        MuestraArray(numeros);
    }

    public static void MuestraArray (int [] numeros) {
        for (int i=0;i<numeros.length;i++) {
            numeros[i] = (int) (Math.random() * 99) + 1;
            System.out.println(numeros[i]);
        }
    }
}



