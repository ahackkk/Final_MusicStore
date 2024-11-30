package org.example;

public class Main {
    public static void main(String[] args) {
        Music APT = new Music("APT", "ROSE & BrunoMars", "K-POP", 173, 2.45, "https://www.youtube.com/watch?v=ekr2nIex040");
        Music takeOnMe = new Music("Take On Me", "A-ha", "Rock", 244, 5, "https://www.youtube.com/watch?v=djV11Xbc914");
        Music muras = new Music("Muras", "Mirbek Atabekov", "National Song", 225, 4, "https://www.youtube.com/watch?v=7ALPIons9NU");
        Music Bailando = new Music("Bailando", "Enrique Inlesias", "Hispanic", 287, 3, "https://www.youtube.com/watch?v=NUsoVlDFqZg");

        User Almanbek = new User("Almanbek", "Rock", 3);
        User Aktan = new User("Aktan", "POP", 1000000);
        User Kutman = new User("Kutmansher", "K-POP", 24);

        System.out.println(APT.get_info());

        System.out.println(Almanbek.get_info());

        Almanbek.buyMusic(APT);
        Almanbek.buyMusic(APT);

        Almanbek.getPlayList();

        Almanbek.listenMusic(APT);
        Almanbek.listenMusic(APT);
        Almanbek.listenMusic(APT);

        APT.getStatistics();
//        Bailando.openVideo();

        Aktan.getBalance();
    }
}