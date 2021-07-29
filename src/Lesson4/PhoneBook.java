package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<Integer, String> phoneBook = new HashMap<>();

        phoneBook.put(192328320,"Surkov");
        phoneBook.put(34323433,"Esenin");
        phoneBook.put(9298320,"Dostoevskiy");
        phoneBook.put(19443420,"Pushkin");
        phoneBook.put(1944110,"Krukov");
        phoneBook.put(12234320,"Surkov");

        System.out.println(phoneBook);

        System.out.println(phoneBook.containsValue("Surkov"));

        ArrayList<String> values = new ArrayList<>(phoneBook.values());
        System.out.println("Значения: " + values);

        Set<Integer> keys = phoneBook.keySet();
        System.out.println("Ключи: " + keys);

        String lastName = phoneBook.get(9298320);
        System.out.println(lastName);


    }
}




