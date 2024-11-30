package org.example;

public class Music {

    String name;
    String author;
    String genre;
    Integer duration;


    public Music(String name, String author, String genre, Integer duration){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
    }

    public String get_info(){
        return this.name + " by " + this.author + " and genre is " + this.genre;
    }
}
