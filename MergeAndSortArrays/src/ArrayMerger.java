/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
import java.util.Arrays;

public class ArrayMerger {
    public static int[] mergeAndSort(int[] nums1, int[] nums2) {
        // Crear un nuevo arreglo para contener todos los elementos
        int[] merged = new int[nums1.length + nums2.length];
        
        // Copiar los elementos de nums1 y nums2 al nuevo arreglo
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        
        // Ordenar el arreglo combinado
        Arrays.sort(merged);
        
        return merged;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] result = mergeAndSort(nums1, nums2);
        
        System.out.println(Arrays.toString(result));  // Salida: [1, 2, 3, 4, 5, 6]
    }
}

