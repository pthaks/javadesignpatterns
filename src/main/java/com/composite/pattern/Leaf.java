package com.composite.pattern;

//LEAF nodes - final nodes, doesnt have child associated

public class Leaf implements Component{

    int age;
    String name;
    String relation;

    public Leaf(String name, int age, String relation) {
        this.age = age;
        this.name = name;
        this.relation=relation;
    }

    @Override
    public void showInfo() {
        System.out.println(this.name + ": " + this.age + ": " + this.relation);
    }

}
