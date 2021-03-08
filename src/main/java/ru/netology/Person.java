package ru.netology;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String city = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge(){
        return getAge() != 0;
    }

    public boolean hasAddress(){
        return getCity() != null;
    }

    public void happyBirthday(){
        if (hasAge()){this.age += 1;}
    }

    public String setAddress(String city){
        this.city = city;
        return getCity();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + (hasAge() ? age : "не определен") +
                ", city='" + (hasAddress() ? city : "не определен") + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder()
                .setSurname(name)
                .setAddress(city);

    }
}
