import java.math.BigDecimal;

public class BigD {

    public static void main(String[] args) {


        BigDecimal bg1,bg2,bg3;


        bg1 = new BigDecimal("40.732");
        bg2 = new BigDecimal("30.12");


        System.out.println("Object Value is " + bg1);
        System.out.println("Augend value is " + bg2);


        bg3 = bg1.add(bg2);


        System.out.println("Result is " + bg3);
    }
}
