package lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {
    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        Map<Integer, List<String>> stats = new HashMap<>();
        ArrayList<String> array = new ArrayList<>();
        for (String string : text.split(" ")) {
            array.add(string);
        }
        for (int i = 0; i < array.size(); i++) {
            int key = array.get(i).length();
            List list = new ArrayList<String>();
            for (int j = i; j < array.size(); j++) {
                if (array.get(j).length() == key) {
                    list.add(array.get(j));
                }

            }
            stats.putIfAbsent(key, list);
        }
        for (Map.Entry<Integer, List<String>> pair : stats.entrySet()) {
            System.out.println(pair.getValue().toString().replaceAll("^\\[|\\]$", ""));
        }
    }
}

