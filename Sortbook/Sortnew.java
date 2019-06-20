package Sortbook;

public class Sortnew implements Comparable<Sortnew> {

        private int BookId;
        private String BookName;
        private String Author;
        private int price;

    public Sortnew(int bookId, String bookName, String author, int price) {
        this.BookId = bookId;
        this.BookName = bookName;
        this.Author = author;
        this.price = price;
    }

    public int getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPrice() {
        return price;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setAuthor(String author) {
        Author = author;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sortnew{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Sortnew o) {
        return 0;
    }
}
