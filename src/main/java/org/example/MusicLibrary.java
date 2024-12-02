package org.example;

import java.util.ArrayList;

public class MusicLibrary {

    private ArrayList<Music> musicList;

    public MusicLibrary() {
        this.musicList = new ArrayList<>();
    }

    // Метод для добавления песни
    public void addMusic(Music music) {
        this.musicList.add(music);
    }

    // Метод для вывода всех песен
    public void displayAllMusic() {
        if (musicList.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            System.out.println("Список всех песен:");
            for (Music music : musicList) {
                System.out.println(music.get_info());
            }
        }
    }

    public static void main(String[] args) {
        // Создаём библиотеку
        MusicLibrary library = new MusicLibrary();

        // Добавляем песни
        library.addMusic(new Music("Song 1", "Author 1", "Pop", 180, 1.99, "http://example.com/song1"));
        library.addMusic(new Music("Song 2", "Author 2", "Rock", 200, 2.99, "http://example.com/song2"));
        library.addMusic(new Music("Song 3", "Author 3", "Jazz", 240, 1.49, "http://example.com/song3"));

        // Выводим список всех песен
        library.displayAllMusic();
    }
}
