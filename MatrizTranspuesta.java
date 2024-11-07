import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;//convierte los datos en texto legible
//clase

public class MatrizTranspuesta {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // Construcción de la primera matriz (2x3)
        int[][] matriz1 = new int[2][3]; // Se declara e inicializa
        System.out.println("Introduce los valores para la matriz A:");

        // Ciclo para solicitar y guardar cada valor en la matriz A
        for (int i = 0; i < 2; i++) { // Recorre cada fila de la matriz
            for (int j = 0; j < 3; j++) {
                System.out.print("Escribe el valor de A[" + i + "][" + j + "]: ");
                entrada = bufer.readLine();// lee cadena de texto
                matriz1[i][j] = Integer.parseInt(entrada); // entero y asigna posicion
            }
        }
        System.out.println("Matriz A:");
        mostrarMatriz(matriz1);// llama y se pasa a argumento
        // Obtener y mostrar la transpuesta de la matriz A
        int[][] transpuestaA = transponerMatriz(matriz1);// metodo transponerMatriz
        System.out.println("Transpuesta de la matriz :");
        mostrarMatriz(transpuestaA);// método mostrarMatriz para mostrar la matriz transpuesta.
    }

    // Método para transponer una matriz
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length; // Calcula Número de filas
        int columnas = matriz[0].length; // Número de columnas
        // Declara la matriz transpuesta
        int[][] transpuesta = new int[columnas][filas];

        // Bucle para llenar la matriz transpuesta intercambiando filas y columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j]; // Asigna el valor de filas y columnas
            }
        }

        return transpuesta;
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) { // Recorre cada fila de la matriz
            for (int elemento : fila) { // Recorre cada elemento en la fila actual
                System.out.print(elemento + "     "); // Imprime cada elemento separado por espacios
            }
            System.out.println();
        }
    }
}
