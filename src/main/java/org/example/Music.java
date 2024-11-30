package org.example;

public class Music {

    String name;
    String author;
    String genre;
    Integer duration;
    double price;
    Integer downloads;
    Integer views;


    public Music(String name, String author, String genre, Integer duration, double price){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
        this.downloads = 0;
        this.views = 0;
    }

    public String toString(){
        return this.name + " by " + this.author;
    }

    public String get_info(){
        return this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " + this.price;
    }

    public void getStatistics(){
        System.out.println(this.name + " was downloaded " + this.downloads + " times, and has " + this.views + " views");
    }
}
