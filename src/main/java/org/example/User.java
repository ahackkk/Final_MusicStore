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
        if(this.musicExists(music)) {
            this.playList.add(music);
            this.money -= music.price;
            System.out.println(this.name + " bought " + music);
        }
        else{
            System.out.println(this.name + " already has bought " + music);
        }
    }

    public boolean musicExists(Music music){
        for(int i=0; i < this.playList.size(); i++){
            if(this.playList.get(i).equals(music)){
                return false;
            }
        }
        return true;
    }
}
