package ru.skypro;

public class Person {

    public Person(String alla, String pugacheva) {
    }

    public static void main(String[] args) {
        Person person = new Person("Alla", "Pugacheva");
        chargeValue(person);
        System.out.println(person);
    }


    private static void chargeValue(Person value) {
        value.setNeme("Maxsim");
        value.setSurname("Galkin");
    }

    private void setSurname(String galkin) {
    }

    private void setNeme(String maxsim) {
    }

}
