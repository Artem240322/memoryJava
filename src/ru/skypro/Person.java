package ru.skypro;

public class Person {

    private String name;
    private String Surname;
    public Person(String name, String pugacheva; String surname;) {
        this.name = name;
        this.name = Surname;
    }

    public String getName() {
        return name;
    }
    public void setSurname(String name) {
        this.name = name;
    }
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String surname) {
        this.surname;
    }
    public String getName(){
        return name;}

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return surname; }

    public void setSurname(String Surname) {
        this.surname = surname;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name+ '\'' +
                ", surname='" + surname+ '\'' +
                '}';
    }
}

