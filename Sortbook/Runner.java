package Sortbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main (String args[])
    {

        List<Sortnew> books= new ArrayList<>();
        books.add(new Sortnew(100,"ABC","Rishabh",1000));
        books.add(new Sortnew(101,"DEF","Isco",2000));
        books.add(new Sortnew(102,"GHI","Bale",10));

        Comparator<Sortnew> com= new Comparator<Sortnew>() {
            @Override
            public int compare(Sortnew o1, Sortnew o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };
        Collections.sort(books,com);

        for ( Sortnew l:books)
        {
            System.out.println(l);
        }


    }
}
