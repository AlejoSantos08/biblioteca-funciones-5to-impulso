import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }
    int resultadosuma = suma (3,5);
    // Suma de dos números
    public static int suma (int a, int b) {
        return (a+b);
    }

    int resultadoresta = resta(3,5);
    // Resta de dos números
    public static int resta(int a, int b) {
        return (a-b);
    }

    int resultadomultiplicacion = multiplicacion (3,5);
    // Multiplicación de dos números
    public static int multiplicacion (int a, int b) {
        return (a*b);
    }

    double resultadodivision = division (3,5);
    // División de dos números
    public static double division (int a, int b) {
        return (a/b);
    }

    int resultadomax = max (3,5);
    // Máximo de dos números
    public static int max (int a, int b) {
        return a>b ? a:b;
    }
    
    int resultadmin = min (3,5);
    // Mínimo de dos números
    public static int min (int a, int b) {
        return (a<b ? a:b);
    }
    int resultadofact = factorial (4);
    // Factorial de un número
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
    boolean resultadopar = esPar (4);
    // Número par
    public static boolean esPar(int n) {
        return (n % 2 == 0);
    }
    boolean resultadoimpar = esImpar (4);
    // Número impar
    public static boolean esImpar(int n) {
        return (n % 2 != 0);
    }
    double resultadopotencia = potencia (4,5);
    // Potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base,exponente);
    }
    double resultadoraiz = raizCuadrada (3);
    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        return Math.sqrt(n);
    }
    int resultadocadena = longitudCadena ("Hola");
    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        return (cadena.length());
    }
    String resultadoconcatenar = concatenarCadenas ("Hola", "Mundo");
    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return (cadena1 + cadena2);
    }
    String resultadoconvertirMayusculas = convertirMayusculas ("hola");
    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return (cadena.toUpperCase());
    }
    String resultadoconvertirMinusculas = convertirMinusculas ("HOLA");
    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return (cadena.toLowerCase());
    }
    String resultadorevertir = revertirCadena ("Hola");
    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        return (cadena.reverse());
    }
    String resultadocontarvoc = contarVocales ("Hola Mundo");
    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
        return contarVocales(cadena);
    }
    int resultadocontpal = contarPalabras ("Hola Mundo");
    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
        return contarPalabras(cadena);
    }
    int resultadoarray = sumarArray(array[1]);
    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        return (array[1] + array[1]);
    }
    int arraymaxresult = maxArray (array [5]);
    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
int arrayminresult = minArray (array [5]);
    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i=1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
    }

    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
    
        return false;
    }

    // Invertir un array
    public static void invertirArray(int[] array) {
      
    }

    // Calcular la media de un array
    public static double mediaArray(int[] array) {
        int suma = sumarArray(array);
        return (double) 3 /5;
    }

    // Encontrar la mediana de un array
    public static double medianaArray(int[] array) {
        ordenarArray(array);
    }

    // Calcular la desviación estándar de un array
    public static double desviacionEstandarArray(int[] array) {
    }

    // Generar un array de números aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int limite) {
    }
}