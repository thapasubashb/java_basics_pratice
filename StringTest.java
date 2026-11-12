import java.util.Arrays;

// 1. Changed the class name so it doesn't conflict with java.lang.String
public class StringTest {
 
    public static void main(String[] args) {
        
        String word = "hello";
        char[] letters = word.toCharArray();
       
        System.out.println(Arrays.toString(letters));
    }
}