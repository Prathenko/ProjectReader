import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();
        String[] words = n.split(" ");
        int[] l = new int[33];
        for (int i = 0; i < words.length; i++) {
            l[ words[i].charAt(0) - 1072]++;
        }
        for (int i = 0; i < 33; i++) {
        }
        System.out.println(l);




    }


}



















