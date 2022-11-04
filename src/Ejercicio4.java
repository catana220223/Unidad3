//Define un array de 10 caracteres y asigna los valores a los elementos según la tabla que se muestra a continuación.
// Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?.
// Indica la respuesta en forma de comentario.



public class Ejercicio4 {
    public static void main(String[] args) {

        char[] numeros=new char[10];
        numeros [0] = 'a';
        numeros [1] = 'x';
        numeros [4] = '@';
        numeros [6] = '"';
        numeros [7] = '+';
        numeros [8] = 'Q';

        for(int i=0;i<numeros.length;i++)
        {
            System.out.println(numeros[i]);
        }
    }
}
//RESPUESTA: LOS VALORES NO INICIALIZADOS APARECEN COMO UN CARACTER NO LEGIBLE
