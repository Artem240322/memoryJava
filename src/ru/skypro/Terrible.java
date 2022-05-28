package ru.skypro;

public class Terrible {

    public static void Terrible(String[] args) {
        Person person = new Person("Alla","Pugacheva");
        chargeValue(person);
        System.out.println(person);
    }

    private static void chargeValue(Person value) {
        value.setNeme("Maxsim");
        value.setSurname("Galkin");

    }
}



