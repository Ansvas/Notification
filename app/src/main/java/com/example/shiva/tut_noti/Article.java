package com.example.shiva.tut_noti;

/**
 * Created by Shiva on 18/10/2017.
 */

class Article {
    public String title;
    public String author;

    public Article() {
        // Default constructor required for calls to DataSnapshot.getValue(Article.class)
    }

    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getName() { return this.title; }

    public String getMessage() { return this.author; }
}
