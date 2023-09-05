package by.Yandr22022022.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Title should not be empty")
    @Size(min = 1, max = 80, message = "Title should be between 1 and 80 characters")
    private String title;

    @NotEmpty(message = "Author Name should not be empty")
    @Size(min = 3, max = 50, message = "Author Name should be between 3 and 50 characters")
    private String author;

    @Min(value = 1800, message = "Year of Publication should be greater than 1800")
    private int year;

    public Book() {
    }

    public Book( String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
