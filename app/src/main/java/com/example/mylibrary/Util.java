package com.example.mylibrary;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Book> allbooks;
    private static ArrayList<Book> currentlyReadingbooks;
    private static ArrayList<Book> wantToReadbooks;
    private static ArrayList<Book> alreadyReadbooks;
    private static int id =0;

    public Util() {
        if(allbooks==null){
            allbooks=new ArrayList<>();
            initAllBooks();
        }
        if (currentlyReadingbooks==null){
            currentlyReadingbooks=new ArrayList<>();
        }
        if (wantToReadbooks==null){
            wantToReadbooks=new ArrayList<>();
        }
        if (alreadyReadbooks==null){
            alreadyReadbooks = new ArrayList<>();
        }
    }


    public static ArrayList<Book> getAllbooks() {
        return allbooks;
    }

    public static ArrayList<Book> getCurrentlyReadingbooks() {
        return currentlyReadingbooks;
    }

    public static ArrayList<Book> getWantToReadbooks() {
        return wantToReadbooks;
    }

    public static ArrayList<Book> getAlreadyReadbooks() {
        return alreadyReadbooks;
    }
    public boolean addCurrentlyReadingBook (Book book){
        return currentlyReadingbooks.add(book);
    }
    public boolean addWantToReadBook (Book book){
        return wantToReadbooks.add(book);
    }
    public boolean addalreadyReadBook (Book book){
        return alreadyReadbooks.add(book);
    }
    public boolean removeCurrentlyReadingBook (Book book){
        return currentlyReadingbooks.remove(book);
    }
    public boolean removeWantToReadBook (Book book){
        return wantToReadbooks.remove(book);
    }
    public boolean removeAlreadyReadBook (Book book){
        return alreadyReadbooks.remove(book);
    }
    private static void initAllBooks() {
        //TODO: Initalize all books array list
    }
}
