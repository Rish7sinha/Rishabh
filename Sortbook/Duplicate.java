package Sortbook;

import java.util.*;

public class Duplicate {

    public static void main(String args[]) {
        HashMap<Integer, Sortnew> hash_map = new HashMap<Integer, Sortnew>();
        Sortnew one = new Sortnew(100, "ABC", "Rishabh", 1000);
        Sortnew two = new Sortnew(101, "DEF", "Isco", 2000);
        Sortnew three = new Sortnew(102, "GHI", "Bale", 10);

        hash_map.put(1, one);
        hash_map.put(2, two);
        hash_map.put(3, two);

        System.out.println(" The HashMap "+hash_map);
        Collection<Sortnew> list = hash_map.values();
        for(Iterator<Sortnew> itr = list.iterator(); itr.hasNext();)
        {
            if(Collections.frequency(list, itr.next())>1)
            {
                itr.remove();
            }
        }

        System.out.println(" HashMap with removed objects ");
        for (Map.Entry<Integer, Sortnew> entry:hash_map.entrySet()){
            Sortnew b = entry.getValue();
            System.out.println(b.getAuthor()+" "+b.getBookName());
        }

        //HashSet<Sortnew> set = new HashSet();
        //set.add(one);
        //set.add(two);
        //set.add(three);


        //for (Sortnew b : set) {
          //  System.out.println(b.getAuthor()+ " " + b.getBookName());
        //}


    }

}
