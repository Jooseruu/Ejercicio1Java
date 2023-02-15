import java.util.Scanner;

public class MenuEjerciciosFinit {
  public static void main(String[] args) {
    int opcion; // Declaración de la variable opcion
    int[] numeros = new int[5]; // Declaración del array numeros
    
    System.out.println("Menú de Ejercicios:"); // Impresión del menú de opciones
    System.out.println("1. Ejercicio1");
    System.out.println("2. Ejercicio2");
    System.out.println("3. Ejercicio3");
    System.out.println("4. Ejercicio4");
    System.out.println("5. Ejercicio5");
    System.out.println("6. Ejercicio6");
    System.out.println("7. Ejercicio7");
    System.out.println("8. Ejercicio8");
    System.out.println("9. Ejercicio9");
    System.out.println("Selecciona una opción:");
    opcion = Integer.parseInt(System.console().readLine()); // Lectura de la opción ingresada por el usuario
    
    switch (opcion) {  // Estructura switch para llamar a los métodos correspondientes según la opción seleccionada por el usuario
      case 1:
        Ejercicio1(numeros);
        break;
      case 2:
        Ejercicio2(numeros);
        break;
      case 3:
        Ejercicio3(args);
        break;
      case 4:
        Ejercicio4(args);
        break;
      case 5:
        Ejercicio5(null);
        break;
      case 6:
        Ejercicio6(args);
        break;
      case 7:
        Ejercicio7(args);
        break;
      case 8:
      Ejercicio8(args);
        break;
      case 9:
      Ejercicio9();
        break;
      default:
        System.out.println("Opción inválida");
    }
  }
  
  public static void Ejercicio1(int[] numeros) {
    for (int i = 0; i < numeros.length; i++) { // Ciclo for para solicitar al usuario que introduzca cinco números y almacenarlos en el array numeros
      System.out.println("Introduce el número " + (i + 1) + ":");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Los números introducidos son:");
    for (int i = 0; i < numeros.length; i++) {// Ciclo for para imprimir los números almacenados en el array numeros
      System.out.println(numeros[i]);
    }
  }

  
  public static void Ejercicio2(int[] numeros) {
    for (int i = 0; i < numeros.length; i++) { // Ciclo for para solicitar al usuario que introduzca cinco números y almacenarlos en el array numeros
      System.out.println("Introduce el número " + (i + 1) + ":"); //Se inicia un ciclo for que recorre el array numeros desde el índice 0 hasta el índice numeros.length - 1.
      numeros[i] = Integer.parseInt(System.console().readLine()); //Se lee el número introducido por el usuario y se almacena en el array numeros en la posición i.
    }
    
    System.out.println("Los números introducidos en orden inverso son:"); 
    for (int i = numeros.length - 1; i >= 0; i--) { // Ciclo for para imprimir los números almacenados en el array numeros en orden inverso
      System.out.println(numeros[i]);
    }
  }

//Este método Ejercicio3 toma 5 números ingresados por el usuario a través de la consola y cuenta la cantidad de números positivos, negativos y ceros, y calcula el promedio de los números positivos y negativos. Usa un objeto Scanner para leer los números ingresados. Utiliza variables para realizar los cálculos y finalmente imprime los resultados.
  public static void Ejercicio3(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int positiveCount = 0;
      int negativeCount = 0;
      int zeroCount = 0;
      double positiveSum = 0;
      double negativeSum = 0;

      for (int i = 0; i < 5; i++) {
        System.out.print("Introduce un número: ");
        int number = input.nextInt();

        if (number > 0) {
          positiveCount++;
          positiveSum += number;
        } else if (number < 0) {
          negativeCount++;
          negativeSum += number;
        } else {
          zeroCount++;
        }
      }

      double positiveAverage = positiveSum / positiveCount;
      double negativeAverage = negativeSum / negativeCount;

      System.out.println("La cantidad de números positivos es: " + positiveCount);
      System.out.println("La cantidad de números negativos es: " + negativeCount);
      System.out.println("La cantidad de ceros es: " + zeroCount);
      System.out.println("El promedio de los números positivos es: " + positiveAverage);
      System.out.println("El promedio de los números negativos es: " + negativeAverage);
    }
  }

 //Dentro de este método se crea una variable de tipo String llamada text y se le asigna el valor "Perico el Chocolatero". Luego, se llama al método countCharacters y se le pasa como argumento la cadena text. El resultado de countCharacters se almacena en una variable de tipo int llamada count. Finalmente, se imprime en la consola la frase "El texto tiene <count> caracteres." donde <count> es el valor almacenado en la variable count.
  public static void Ejercicio4(String[] args) {
    String text = "Perico el Chocolatero";
    int count = countCharacters(text);
    System.out.println("El texto tiene " + count + " caracteres.");
  }

  public static int countCharacters(String text) {
    return text.length();
  }

// utiliza la clase Scanner para obtener una entrada de texto del usuario a través de la consola. Luego, llama al método invertirTexto y pasa el texto introducido como argumento. Finalmente, imprime el texto invertido por pantalla.
    public static void Ejercicio5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        String textoInvertido = invertirTexto(texto);
        
        System.out.println("El texto invertido es: " + textoInvertido);
    }
    
    public static String invertirTexto(String texto) { 
        char[] caracteres = texto.toCharArray();
        int longitud = caracteres.length;
        char[] invertidos = new char[longitud];
        
        for (int i = 0; i < longitud; i++) { //bucle for que recorre la cadena de texto desde el final hasta el principio y va concatenando cada carácter en una nueva cadena
            invertidos[i] = caracteres[longitud - 1 - i];
        }
        
        return new String(invertidos);
  }


  public static void Ejercicio6(String[] args) { //llama a un método "eliminarEspacios" y pasa la cadena de texto "texto" como argumento. Después de eso, almacena el valor devuelto por el método en una variable "textoSinEspacios".
    String texto = "Paco el chocolatero es un bandolero!";
    String textoSinEspacios = eliminarEspacios(texto);
    System.out.println("Texto sin espacios: " + textoSinEspacios);
}

public static String eliminarEspacios(String texto) {
    return texto.replaceAll("\\s+", "");


  }
  public static void Ejercicio7(String[] args) { //Tenemos 2 strings "Cadena1 y Cadena2 creamos un metodo "concatenar cadenas" que simplemente suma "Cadena1" con "Cadena2"
    String cadena1 = "Paco";
    String cadena2 = " el chocolatero";
    
    String concatenacion = concatenarCadenas(cadena1, cadena2);
    System.out.println("La concatenación de las dos cadenas es: " + concatenacion);
}

public static String concatenarCadenas(String cadena1, String cadena2) {
    return cadena1 + cadena2;
  }
    public static void Ejercicio8(String[] args) { //Dentro del método, se define una cadena de texto llamada "cadena" y se le asigna el valor "Paquito el chocolatero", y una variable "vocal" de tipo carácter con el valor 'a'.
        String cadena = "Paquito el chocolatero";
        char vocal = 'a';
        System.out.println("Cadena original: " + cadena);
        System.out.println("Vocal a reemplazar: " + vocal);
        cadena = Ejercicio(cadena, vocal);
        System.out.println("Cadena con vocales sustituidas: " + cadena);
    }

    public static String Ejercicio(String cadena, char vocal) {
        // Convertir la cadena en un arreglo de caracteres
        char[] caracteres = cadena.toCharArray();

        // Iterar sobre los caracteres y reemplazar las vocales con la vocal pasada como parámetro
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                caracteres[i] = vocal;
            }
        }

        // Convertir el arreglo de caracteres de nuevo en una cadena y devolverla
        return new String(caracteres);
    }

    

    public static void Ejercicio9() {
      String cadena = "Paco chocolates"; 
      for (int i = 0; i < cadena.length(); i++) { //Se utiliza un bucle for para iterar sobre los caracteres de la cadena. En cada iteración del bucle, se extrae un carácter de la cadena utilizando el método "charAt(i)", donde "i" es el índice del carácter que se desea extraer. El carácter extraído se almacena en la variable "caracter"
        
        //Se convierte el carácter a su correspondiente código ASCII utilizando la función "int()", y se almacena en la variable "codigoASCII". Finalmente, se imprime un mensaje en la consola que muestra el carácter y su código ASCII correspondiente.
          char caracter = cadena.charAt(i);
          int codigoASCII = (int) caracter;
          System.out.println("El código ASCII de '" + caracter + "' es: " + codigoASCII);
     }
  }
}












  

      
    