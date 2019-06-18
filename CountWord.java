
public class CountWord {
    static int wordcount(String s)
    {
        int count=0;

        char ch[]= new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s ="  this is example for string token or delimeter using split method you can split";
        System.out.println(wordcount(s) + " words.");
    }
}
