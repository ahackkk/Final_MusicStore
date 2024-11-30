package org.example;

public class Main {
    public static void main(String[] args) {
        Music APT = new Music("APT", "ROSE & BrunoMars", "KPOP", 173, 2.45);
        Music takeOnMe = new Music("Take On Me", "A-ha", "Rock", 244, 5);

        User Almanbek = new User("Almanbek", "POP", 3);

        System.out.println(APT.get_info());

        System.out.println(Almanbek.get_info());

        Almanbek.buyMusic(APT);
        Almanbek.buyMusic(APT);

        Almanbek.getPlayList();

        Almanbek.listenMusic(APT);
    }
}