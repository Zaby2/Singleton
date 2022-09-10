import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Singleton sng = new Singleton();
        System.out.println(Singleton.getInstance());
    }
}