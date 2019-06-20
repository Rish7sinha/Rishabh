package Books;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;



public class SortBook {
    public int BookId;
    public String BookName;
    public String Author;
    public int price;
    public String IssuedDate;
    public String ReturnDate;
    public String submission;
    public double fine;

    public SortBook(int BookId,String BookName,String Author,int price, String IssuedDate, String ReturnDate,String submission){
        this.BookId=BookId;
        this.BookName=BookName;
        this.Author=Author;
        this.price=price;
        this.IssuedDate=IssuedDate;
        this.ReturnDate=ReturnDate;
        this.submission=submission;


    }

    public LocalDate localdate1(String date) {
        DateTimeFormatter dateformat1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date1 = LocalDate.parse(date, dateformat1);
        return date1;
    }

    public long finecalc() {
        LocalDate ReturnDate1 = localdate1(ReturnDate);
        LocalDate submission1 = localdate1(submission);
        long fine = 0;
        long days = DAYS.between(ReturnDate1, submission1);
        if (days < 10)
        { fine = 10;
            return fine;}
        else if (days > 10 && days < 15)
        { fine += (days - 10) * 2;
            return fine;}
        else if (days > 15 && days < 30)
        { fine += 10 + (days - 15) * 5;
            return fine;}
        else {
            fine += 75 + (days - 30) * 100;
            return fine;

        }

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

    public String getIssuedDate() {
        return IssuedDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    /*public void printdetails() {
        /*long fine= finecalc();

        System.out.println(getBookId());
        System.out.println(getBookName());
        System.out.println(getPrice());
        System.out.println(getIssuedDate());
        System.out.println(getReturnDate());
        System.out.println(fine);

    }

            System.out.println(arrliid);
            System.out.println(bookname);
            System.out.println(authorname);
            System.out.println(idate);
            System.out.println(rdate);

    }*/
    public static void main (String args[])
    {

        ArrayList<Integer> arrliid = new ArrayList<Integer>(3);
        ArrayList<Integer> arrliprice = new ArrayList<Integer>(3);
        ArrayList<String> bookname = new ArrayList<String>(3);
        ArrayList<String> authorname = new ArrayList<String>(3);
        ArrayList<String> idate = new ArrayList<String>(3);
        ArrayList<String> rdate = new ArrayList<String>(3);

    for(int i=0;i<3;i++) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        int id = input1.nextInt();
        arrliid.add(id);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Book name: ");
        String name = input2.nextLine();
        bookname.add(name);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Author name: ");
        String aname = input3.nextLine();
        authorname.add(aname);

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter Book Price: ");
        int price = input4.nextInt();
        arrliprice.add(price);

        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter Issued Date: ");
        String Issued = input5.nextLine();
        idate.add(Issued);

        Scanner input6 = new Scanner(System.in);
        System.out.println("Enter return date: ");
        String Returndate = input6.nextLine();
        rdate.add(Returndate);

        Book enq = new Book(id, name, price, Issued, Returndate, "6/6/2019");

    }

        Collections.sort(authorname);
        //System.out.println(arrliid);
        //System.out.println(bookname);
        System.out.println(authorname);
        //System.out.println(idate);
        //System.out.println(rdate);


    }
}
