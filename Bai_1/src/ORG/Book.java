package ORG;
public class Book {
    public String title;
    public String author;
    public int year;
    public double price;

    public Book(){
        title = "";
        author = "";
        year = 0;
        price = 0;
    }
    public Book(String title1, String author1, int year1, double price1){
        this.title = title1;
        this.author = author1;
        this.year = year1;
        this.price = price1;

    }

    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

}