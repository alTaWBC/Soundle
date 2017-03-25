package com.example.wbc.soundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
}

public class Type{

    private String name;
    private List<Book> books;
    private List<Playlist> playlists;

    public Type(String name){
        this.name = name;
        books = new LinkedList<Book>();
        playlists = new LinkedList<Playlist>();
    }
}

public class Playlist{

    private String name;
    private String author;
    private List<Music> musics;
    private int rating;
    private int counter;
    private float duration;

    public Playlist(String name, String author){
        this.name = name;
        this.author = author;
        musics = new LinkedList<Music>();
        rating = 0;
        counter = 0;
        duration = 0;
    }
}

public class Music{

    private String name;
    private String author;
    private Type tipo;
    private float duration;
    private int rating;
    private int counter;


    public Music(String name, String author, Type tipo, float duration){
        this.name = name;
        this.author = author;
        this.tipo = tipo;
        rating = 0;
        counter = 0;
        this.duration = duration;
    }
}