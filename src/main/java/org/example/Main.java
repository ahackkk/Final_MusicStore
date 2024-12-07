package org.example;

public class Main {
    public static void main(String[] args) {

        Genre rock = new Genre("Rock");
        Genre hispanic = new Genre("Hispanic");
        Genre kpop = new Genre("K-POP");
        Genre national = new Genre("National Song");
        Author aha = new Author("A-ha", "");
        Author enrique = new Author("Enrique", "Inlesias");
        Author rose = new Author("ROSE", "& BrunoMars");
        Author mirbek = new Author("Mirbek", " Atabekov");

        Music APT = new Music("APT", rose, kpop, 173, 2.45, "https://www.youtube.com/watch?v=ekr2nIex040");
        Music takeOnMe = new Music("Take On Me", aha, rock, 244, 5, "https://www.youtube.com/watch?v=djV11Xbc914");
        Music muras = new Music("Muras", mirbek, national, 225, 4, "https://www.youtube.com/watch?v=7ALPIons9NU");
        Music Bailando = new Music("Bailando", enrique, hispanic, 287, 3, "https://www.youtube.com/watch?v=NUsoVlDFqZg");

        User Almanbek = new User("Almanbek", "Rock", 3);
        User Aktan = new User("Aktan", "POP", 1000000);
        User Kutman = new User("Kutmansher", "K-POP", 24);

        System.out.println(rose.getInfo());
        System.out.println(aha.getInfo());
        System.out.println(hispanic.getInfo());
        System.out.println(national.getInfo());

//
//        System.out.println(Almanbek.get_info());
//
//        Almanbek.buyMusic(APT);
//        Almanbek.buyMusic(APT);
//
//        Almanbek.getPlayList();
//
//        Almanbek.listenMusic(APT);
//        Almanbek.listenMusic(APT);
//        Almanbek.listenMusic(APT);
//
//        APT.getStatistics();
////        Bailando.openVideo();
//
//        Aktan.getBalance();

//        System.out.println("All songs:");
//        for (Music music : Music.getAllMusic()) {
//            System.out.println(music.get_info());
//        }
    }
}