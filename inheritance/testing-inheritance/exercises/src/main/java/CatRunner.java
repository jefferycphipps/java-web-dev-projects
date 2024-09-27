import java.util.*;

public class CatRunner {

    public static void main(String[] args){
        HouseCat snipercat = new HouseCat("snipercat", 22.5);
        Cat louie = new Cat(10);
        System.out.println(snipercat.noise());
        System.out.println(louie.noise());
        System.out.println(snipercat.purr());
    }
}
