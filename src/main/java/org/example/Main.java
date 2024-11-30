package org.example;

public class Main {
    public static void main(String[] args) {
        Music APT = new Music("APT", "ROSE & BrunoMars", "KPOP", 173, 2.45);

        User Almanbek = new User("Almanbek", "POP", 120);

        System.out.println(APT.get_info());

        System.out.println(Almanbek.get_info());

        Almanbek.buyMusic(APT);
    }
}