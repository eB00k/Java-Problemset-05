////import java.util.Locale;
////import java.util.Scanner;
////
////public class QA {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        String word = in.next();
////        String[] points = {"+", "AEIOULNRST","DG", "BCMP", "FHVWY", "K", "+", "+", "JX", "+", "QZ"};
////        int res = 0;
////        for(int i = 0; i < word.length(); i++) {
////            char ch = word.toUpperCase().charAt(i);
////            for(int j = 0; j < points.length; j++) {;
////                String point = points[j];
////                for(int k = 0; k < point.length(); k++) {
////                    if(ch == (point.charAt(k))) {
////                        res += j;
////                        break;
////                    }
////                }
////            }
////        }
////        System.out.println(res);
////    }
////}
//
//import java.util.Arrays;
//
//public class Book {
//    private String name;
//    private Author[] authors;
//    private double price;
//    private int qty;
//
//    public Book(String name, Author[] authors, double price) {
//        this.name = name;
//        this.authors = authors;
//        this.price = price;
//        this.qty = 0;
//    }
//
//    public Book(String name, Author[] authors, double price, int qty) {
//        this.name = name;
//        this.authors = authors;
//        this.price = price;
//        this.qty = qty;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Author[] getAuthors() {
//        return authors;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getQty() {
//        return qty;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public String getAuthorName() {
//        return authors[0].getName();
//    }
//
//    public String getAuthorEmail() {
//        return authors[0].getEmail();
//    }
//
//    public char getAuthorGender() {
//        return authors[0].getGender();
//    }
//
//    @Override
//    public String toString() {
//        return "Book[name=" + name + ",authors=" + Arrays.toString(authors) + ",price=" + price + ",qty=" + qty + "]";
//    }
//}
