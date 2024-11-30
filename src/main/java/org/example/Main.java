package org.example;

public class Main {
    public static void main(String[] args) {
        Music APT = new Music("APT", "ROSE & BrunoMars", "KPOP", 173, 2.45);


        User Almanbek = new User("Almanbek", "POP", 2);

        System.out.println(APT.get_info());

        System.out.println(Almanbek.get_info());

        Almanbek.buyMusic(APT);
        Almanbek.buyMusic(APT);

        Almanbek.getPlayList();
    }
}