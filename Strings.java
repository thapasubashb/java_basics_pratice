
import java.util.Arrays;

public class Strings {


    String a = "james bond ";
    public static void main(String[] args) {
        
        String[] name = {"my", "name", "is", "subash"};

        System.out.println(name);
        System.out.println(Arrays.toString(name));
       
        Strings obj = new Strings();
        obj.a = " subash is the new james bond " ;

        System.out.println(obj.a);
    }
    
}
