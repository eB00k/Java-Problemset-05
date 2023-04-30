package Playground;

import java.time.LocalDate;
import java.util.*;

public class Playground {
    public static void main(String[] args) {
        User user = new User("Dastan", "2003-12-10");
        System.out.printf("%s was born in %s and he/she now is %d years old.\n", user.getName(), user.getBirthDay(), user.age());

        Book book = new Book("Atomic Habits", "James Clear", 234);
        AudioBook audioBook1 = new AudioBook("Make Time", "Harry Maquire", 3000);
        Ebook eBook = new Ebook("The Animal Farm", "Robert Kiosaki", 50, "pdf");

        user.borrow(book);
        user.borrow(book);
        System.out.println(user.getName() + " has borrowed " + user.borrowedBooks());

        System.out.println(book.getTitle());
        System.out.println(audioBook1.toString());
        System.out.println(eBook.toString());
    }
}

