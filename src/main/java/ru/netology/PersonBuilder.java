package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname){
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age){
        if (age <= 0){
            throw new IllegalArgumentException("Некорректное значение возраста!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city){
        this.city = city;
        return this;
    }

    public Person build(){
        if (name == null || "".equals(name)){
            throw new IllegalStateException("Не заполнено имя!");
        }
        if (surname == null || "".equals(surname)){
            throw new IllegalStateException("Не заполнена фамилия!");
        }
        Person person = new Person(name, surname, age);
        person.setAddress(city);
        return person;
    }
}
