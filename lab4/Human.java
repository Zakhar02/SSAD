package com.moofiyTv.mossapp.homework;
// Zakhar Yagudin
// Продам зимнюю резину R14 БУ

import java.util.List;

// lab work
// This Class violates all SOLID Principles, fix it in a Logical way;
public class Human{

    private String name;
    private String nickname;
    private double salary;
    private List<String> hobbies;
    private bool married;

    void calculateTax(int percentage) {
        salary = salary * percentage;
    }

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    public void getMarried() {
    }

    public static void main(String[] args) {
        Human human = new Human();
    }
}

class Employee extends Human implements Employee {
    public void becomeEmployee() {
    }
}

class Owner extends Human implements Company{
    public void ownCompany() {
    }
}

class Hello {
    enum Languages {Arabic, English, Japanese}

    String sayHello(Languages languages) {
        if (languages == Languages.Arabic)
        return "مرحبا";
        return "Hello";
    }
}

class Pray implements Pray{
    public void pray() {
    }
}

class Sport implements Sport{
    public void playSports() {
    }
}

// Single responsibility: Split one class on many singly responsible classes.
// Open/closed: Fine.
// Liskov substitution:???
// Interface segregation: Many interfaces are better than single interface.
// Dependency inversion: Fine.

// Кому нужна зимняя резина, пишите в тг: @ZYagudin
