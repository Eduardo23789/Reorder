/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class SentenceReorderer {
    public static String reorderSentence(String[] words) {
        // Crear un arreglo para almacenar las palabras reordenadas
        String[] reordered = new String[words.length];
        
        // Iterar sobre cada palabra
        for (String word : words) {
            // Extraer el número final de la palabra
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            // Quitar el número y colocar la palabra en su posición correcta
            reordered[index] = word.substring(0, word.length() - 1);
        }
        
        // Unir las palabras en una oración y devolver la oración reordenada
        return String.join(" ", reordered);
    }

    public static void main(String[] args) {
        String[] words = {"esta2", "bien4", "muy3", "esto1"};
        String result = reorderSentence(words);
        System.out.println(result);  // Salida: "esto esta muy bien"
    }
}
