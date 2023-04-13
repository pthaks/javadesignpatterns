package com.composite.pattern;

import java.util.ArrayList;
import java.util.List;

//NODE component - Composite node, which has child leaf
public class Composite implements Component{

    String name;
    String relation;

    public Composite(String name, String relation) {
        this.name = name;
        this.relation = relation;
    }

    List<Component> components = new ArrayList<Component>();

    public void addComponent(Component comp){
        components.add(comp);
    }

    @Override
    public void showInfo() {
        System.out.println(name + ": " + relation);
        for (Component c : components){
            c.showInfo();
        }
    }



}
