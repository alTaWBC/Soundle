package com.example.wbc.soundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}


public class Book{

    private String name;
    private String author;
    private Type tipo;

    public Book(String name, String author, Type tipo){
        this.name = name;
        this.author = author;
        this.tipo = tipo;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public Type getTipo(){
        return tipo;
    }
}

public class Type{

    private String name;
    private List<Book> books;
    private List<Playlist> playlists;

    public Type(String name, Type tipo){
        this.name = name;
        books = new LinkedList<Book>();
        playlists = new LinkedList<Playlist>();
        this.tipo = tipo;
    }

    public String getName(){
        return name;
    }

    public addBook()
}

public class Playlist{

    private String name;
    private String author;
    private List<Music> musics;
    private int rating;
    private int counter;
    private float duration;
    private Type tipo;

    public Playlist(String name, String author){
        this.name = name;
        this.author = author;
        musics = new LinkedList<Music>();
        rating = 0;
        counter = 0;
        duration = 0;
    }

    public void rate(int rating){
        this.rating += rating;
        counter++;
    }

    public float getRating(){
        return rating/counter;
    }

    public float getDuration(){
        return duration;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public void addMusic(Music music)throws AllException{
        if (musics.contains(music))
            throw new AllException();
        musics.add(music);
        rating += music.getRating();
        counter++;
        duration += music.getDuration();
    }

    public void remMusic(Music music) throws AllException{
        if (musics.contains(music))
            throw new AllException();
        musics.remove(music);
        rating -= music.getRating();
        counter--;
        duration -= music.getDuration();
    }

    public Iterator<Music> getMusics(){
        return musics.iterator();
    }
}

public class AllException extends Exception {

    private static final String OTHER_LOGGED = "BATATA.";

    /**
     *
     */
    public AllException() {
        super(OTHER_LOGGED);
    }

    /**
     * @param message
     */
    public AllException(String message) {
        super(message);
    }

}

public class Music{

    private String name;
    private String author;
    private float duration;
    private int rating;
    private int counter;


    public Music(String name, String author, Type tipo, float duration){
        this.name = name;
        this.author = author;
        rating = 0;
        counter = 0;
        this.duration = duration;
    }

    public void rate(int rating){
        this.rating += rating;
        counter++;
    }

    public float getRating(){
        return rating/counter;
    }

    public float getDuration(){
        return duration;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

}