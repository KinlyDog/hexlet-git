import java.util.*;

import func.RandomStringGen;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        // создаем и заполняем список случайных строк
        ArrayList<String> stringList = new ArrayList<>();
        while (stringList.size() < 100) {
            stringList.add(RandomStringGen.strGen(10));
        }

        // создаем и заполняем список случайных чисел
        ArrayList<Integer> intList = new ArrayList<>();
        while (intList.size() < 100) {
            int count = rand.nextInt(1000);

            // если список НЕ содержит значение count, добавляем его
            if (!intList.contains(count)) {
                intList.add(count);
            }
        }

        // создаем словарь и заполняем его
        HashMap<Integer, String> pairList = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            pairList.put(intList.get(i), stringList.get(i));
        }

        // выводим значения по всем ключам
        for (String i : pairList.values()) {
            System.out.println(i);
        }

        // удаляем значения из словаря по списку ключей
        ArrayList<Integer> keyList = new ArrayList<>(pairList.keySet());
        for (int i : keyList) {
            pairList.remove(i);
        }

    }
}