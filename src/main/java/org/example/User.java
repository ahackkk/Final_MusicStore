package org.example;

public class User {
    String name;
    String favorite_genre;
    double money;

    public User(String name, String favorite_genre, double money){
        this.name = name;
        this.favorite_genre = favorite_genre;
        this.money = money;
    }

    public String get_info(){
        return this.name + " Favorite Genre is " + this.favorite_genre + " and he/she has " + this.money + " soms";
    }
}
