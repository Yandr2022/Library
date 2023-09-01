package by.Yandr22022022.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Book Name should not be empty")
    @Size(min = 1, max = 80, message = "Book Name should be between 1 and 80 characters")
    private String name;

    @NotEmpty(message = "Author Name should not be empty")
    @Size(min = 3, max = 50, message = "Author Name should be between 3 and 50 characters")
    private String author;

    @Min(value = 1800, message = "Year of Publication should be greater than 1800")
    private int yearOfPublication;

    public Book() {
    }

    public Book(int id, String name, String author, int yearOfPublication) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
