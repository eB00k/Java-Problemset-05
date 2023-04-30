package Playground;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User { // public to make available for the entire program
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<>();

    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }


}
