import java.util.*;


public class Main {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("hello");
        String s3 = new String("hello");

        s1 = s3;
        System.out.println(s1.equals(s3));
    }
}