package org.example;

import java.util.Vector;

public class User {
    String name;
    String favorite_genre;
    double money;

    Vector<Music> playList;

    public User(String name, String favorite_genre, double money){
        this.name = name;
        this.favorite_genre = favorite_genre;
        this.money = money;
        this.playList = new Vector<Music>();
    }

    public String get_info(){
        return this.name + " Favorite Genre is " + this.favorite_genre + " and he/she has " + this.money + " soms";
    }

    public void buyMusic(Music music){
        this.playList.add(music);
        this.money -= music.price;
        System.out.println(this.name + " bought " + music);
    }
}
