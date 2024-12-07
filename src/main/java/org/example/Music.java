package org.example;

import java.awt.Desktop;
import java.net.URI;
//import java.util.ArrayList;
//import java.util.List;

public class Music {

    String name;
    Author author;
    Genre genre;
    Integer duration;
    double price;
    Integer downloads;
    Integer views;
    String url;

    // Статический список для хранения всех песен
//    private static List<Music> allMusic = new ArrayList<>();

    public Music(String name, Author author, Genre genre, Integer duration, double price, String url) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
        this.downloads = 0;
        this.views = 0;
        this.url = url;

        genre.quantity_music++;
        author.quantity_music++;

//        allMusic.add(this);
    }

    public String toString() {
        return this.name + " by " + this.author;
    }

    public String get_info() {
        return this.name + " by " + this.author + ". genre: " + this.genre + ". Costs " + this.price;
    }

    public void getStatistics() {
        System.out.println(this.name + " was downloaded " + this.downloads + " times, and has " + this.views + " views");
    }

    public void openVideo() {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(this.url));
            } else {
                System.out.println("Открытие браузера не поддерживается.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static List<Music> getAllMusic() {
//        return allMusic;
//    }
}