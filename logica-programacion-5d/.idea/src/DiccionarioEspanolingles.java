import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioEspanolingles {

    public static void main(String[] args) {

        //Crear diccionario con 20 palabras
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("gato", "cat");
        diccionario.put("puerta", "door");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("guitarra", "guitar");
        diccionario.put("mariposa", "butterfly");
        diccionario.put("leer", "read");
        diccionario.put("juguete", "toy");
        diccionario.put("escritorio", "desk");
        diccionario.put("silla", "chair");
        diccionario.put("perro", "dog");
        diccionario.put("cama", "bed");
        diccionario.put("cielo", "sky");
        diccionario.put("comida", "food");
        diccionario.put("luna", "moon");
        diccionario.put("ventana", "window");
        diccionario.put("tiempo", "time");
        diccionario.put("computadora", "computer");
        diccionario.put("sol", "sun");

        //Se incorporan las palabras en español a una lista para elegir al azar
        ArrayList<String> listaPalabras = new ArrayList<>(diccionario.keySet());
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int correctas = 0;
        int incorrectas = 0;
        System.out.println("Traduce al ingles las siguientes palabras");
        System.out.println();

 //Repito 5 veces
        for (int i = 1; i <= 5; i++) {
// Elijo una posición al azar y saco la palabra de la lista
            // (con remove no se repite la misma palabra)
            int posicion = aleatorio.nextInt(listaPalabras.size());
            String palabraEspanol = listaPalabras.remove(posicion);

            String traduccionCorrecta = diccionario.get(palabraEspanol);

            System.out.print(i + ". ¿Cómo se dice \"" + palabraEspanol + "\" en inglés? ");
            String respuesta = lector.nextLine();

            if (respuesta.trim().equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto, la respuesta era: " + traduccionCorrecta);
                incorrectas++;
            }
            System.out.println();

        }

    }

         }