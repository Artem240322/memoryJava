package ru.skypro;

import java.util.Arrays;

public class Main {
    // задача 5 (1)
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    private static void changeValue(int value) {
        value = 22;

    }


    // задача 6 (2)
    public static void String(String[] args) {
        Integer value = 33;
        changeValue(value);
        System.out.println(value);
    }

    private static void changeValue(Integer value) {
        value = 22;

    }


    /// Задача 7 (3)
    protected static void mainNew(String[] args) {
        Integer[] value = {3, 4};
        changeValue(value.length);
        System.out.println(Arrays.toString(new Integer[]{value.length}));
    }

    private static void Integer(Integer[] value) {
        value[0] = 99;
    }


    /// Задача 8 (4)

    protected static void mainGo(String[] args) {
        int[] value = {3, 4};
        changeValue(value.length);
        System.out.println(Arrays.toString(new Integer[]{value.length}));
    }

    private static void chengValue(int[] value) {
        value = new int[]{1, 2};

    }


    /// Задача 9-10

    public static void main(String[] args) {
        Person person = new Person("Alla", "Pugacheva");
        chargeValue(person);
        System.out.println(person);
    }

    private static void chargeValue(Person value) {
        value.setNeme("Maxsim");
        value.setSurname("Galkin");

    }
}





