package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
          mapDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        var i = fruits.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

//        System.out.println(fruits);
//        fruits.remove("lemon");
//        System.out.println("contains a lemon?" + fruits.contains("lemon"));
//        System.out.println("size: " + fruits.size());
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");

        fruits.set(2, "grape");

        fruits.forEach(fruit -> System.out.println(fruit));

//        for(String fruit: fruits) {
//            System.out.println(fruits);
//        }

//        System.out.println(fruits);
//        System.out.println(fruits.get(2));
//        System.out.println(fruits.lastIndexOf("lemon"));

        List moreFruit = List.of("cherry", "plum"); // immutable
    }

    public static void queueDemo() {
        Queue<Object> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");

        var removed = fruits.remove();

        System.out.println(fruits);
    }

    public static void mapDemo() {

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);

//        for(Map.Entry calorieInfo : fruitCalories.entrySet()) {
//            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
//        }

        fruitCalories.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("banana"));
        System.out.println(fruitCalories.containsKey("lemon"));
    }
}
