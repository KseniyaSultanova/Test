package Lesson4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] array = {
                "Зима","Весна","Зима","Лето","Aпельсин","Осень","Весна", "Лето","Зима",
                "Осень","Арбуз","Осень","Осень","Лето","Шоколад","Виноград","Абрикос"
        };

        checkArray(array);
    }

    private static void checkArray(String[] array) {

        Set<String> arr = new HashSet<>();
        for (String s : array) {
            arr.add(s);
        }
        for (String s : arr) {
            int i = 0;
            for (String s1 : array) {
                if(s.equals(s1)){
                    i++;
                }
            }
            System.out.println("В массиве: " + s + ": " + i + "шт.");
        }
    }
}
