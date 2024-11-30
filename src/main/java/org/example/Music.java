package org.example;

public class Music {

    String name;
    String author;
    String genre;
    Integer duration;
    double price;
    Integer downloads;


    public Music(String name, String author, String genre, Integer duration, double price){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
        this.downloads = 0;
    }

    public String get_info(){
        return this.name + " by " + this.author + " and genre is " + this.genre;
    }

    public String toString(){
        return this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " + this.price;
    }

}
