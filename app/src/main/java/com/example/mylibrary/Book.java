package com.example.mylibrary;

public class Book {
    private int id;

    private String Bookname;
    private String author;
    private int pages;
    private String imageURL;
    private String description;

   // public Book(String gifted_hands, String s, int i, String s1, String biography_of_us_surgeon) {
   // }

    public Book(int id, String bookname, String author, int pages, String imageURL, String description) {
        this.id = id;
        Bookname = bookname;
        this.author = author;
        this.pages = pages;
        this.imageURL = imageURL;
        this.description = description;
    }

    public Book(String gifted_hands, String bookname, int i, String s, String biography_of_us_surgeon) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //create a constructor, getter and setters

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Bookname='" + Bookname + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", imageURL='" + imageURL + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
