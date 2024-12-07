package org.example;

public class Author {
    String name;
    String surname;
    Integer quantity_music;


    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.quantity_music = 0;
    }

    public String toString(){
        return this.name + " " + this.surname;
    }

    public String getInfo(){
        return this.name + " has " + this.quantity_music + " song/s";
    }
}