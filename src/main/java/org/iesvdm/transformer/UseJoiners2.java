package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Arrays;

public class UseJoiners2 {
    public static void main(String[] args) {
        // Creamos dos ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        // Creamos un objeto JoinByAdding
        JoinByAdding joiner = new JoinByAdding();

        // Usamos el metodo zipArrayLists para unir las listas
        ArrayList<Integer> result = Joiners.zipArrayLists(joiner, list1, list2);

        System.out.println(result);  // Salida: [5, 7, 9]
    }
}