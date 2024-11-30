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
            System.out.println(this.name + " already has bought " + music);
        }
        else if(this.money < music.price){
            System.out.println(this.name + " can't buy " + music + " cause he's poor :(");
        }
        else{
            this.playList.add(music);
            this.money -= music.price;
            music.downloads ++;
            System.out.println(this.name + " bought " + music.price);
        }
    }

    public boolean musicExists(Music music){
        for(int i=0; i < this.playList.size(); i++){
            if(this.playList.get(i).equals(music)){
                return true;
            }
        }
        return false;
    }

    public void getPlayList(){
        System.out.println(this.name + " has these songs: \n");
        for(int i = 0; i < this.playList.size(); i++){
            System.out.println(this.playList.get(i));
        }
    }

    public void listenMusic(Music music){
        if(this.musicExists(music)) {
            music.views++;
            System.out.println(this.name + " is listening to " + music + "  ♫⋆｡♪ ₊˚♬ ﾟ.♫⋆｡♪ ₊˚♬ ﾟ.");
        }
        else{
            System.out.println(this.name + " can't listen to " + music + " it's not in his playList");
        }
    }
}
