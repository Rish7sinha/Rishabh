import java.util.HashMap;
import java.util.Map;


public class occuranceofwords {
    public static void main(String[] args) {
        occuranceofwords countWord = new occuranceofwords();
        countWord.countWords("This is Enquero Enquero is a service and product company This company is in Bangalore");
    }

    public void countWords(String input) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
                if (map.containsKey(str)) {
                    int count =map.get(str);
                    map.put(str, count + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }

        System.out.println("Count :- " + map);
    }

}