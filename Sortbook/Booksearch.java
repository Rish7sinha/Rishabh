package Sortbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Booksearch {

    public static void main(String args[])
    {
        List<Sortnew> books= new ArrayList<>();
        books.add(new Sortnew(100,"ABC","Rishabh",1000));
        books.add(new Sortnew(101,"DEF","Isco",2000));
        books.add(new Sortnew(102,"GHI","Bale",10));

        HashMap<String,String> hash_map = new HashMap<String,String>();
        hash_map.put("Rishabh","ABC");
        hash_map.put("Isco","DEF");
        hash_map.put("Bale","GHI");

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter key to be searched:");
        String key= sc.nextLine();

        boolean flag=hash_map.containsKey(key);
        if (flag==true)
            System.out.println("Enter Book is :"+ hash_map.get(key));
        else
            System.out.println("Not Found");
        }
    }
