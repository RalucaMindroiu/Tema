
package com.tema.entity;

public class Salate {


    private static int globalId = 1;
    private int id;
    private String name;
    private Meniu menu;

    public Salate() {
    }

    public Salate(String name, Meniu menu) {
        this.id = globalId;
        globalId++;
        this.name = name;
        this.menu = menu;
    }

    public Salate(int id, String name, Meniu menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }

    public Salate(Object salata_caesar, Salate salad1) {
        
    }

    public Salate(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Meniu getMenu() {
        return menu;
    }

    public void setMeniu(Meniu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Salate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menu=" + menu +
                '}';
    }

    public void comandaMancarea() {
    }
}
