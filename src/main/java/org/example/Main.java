package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String texto = "O ESTAGIARIO VAI CONSEGUIR!";
        System.out.println(substituirVogais(texto));
    }

    public static String substituirVogais(String texto) {
        Map<Character, Character> mapa = new HashMap<>();
        mapa.put('a', '@');
        mapa.put('e', '#');
        mapa.put('i', '!');
        mapa.put('o', '$');
        mapa.put('u', '%');

        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if (mapa.containsKey(lower)) {
                sb.append(mapa.get(lower));
            } else {
                sb.append(c);
            }
        }
        return sb.toString(); 
        

    }
}