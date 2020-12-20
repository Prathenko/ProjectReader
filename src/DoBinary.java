import java.util.Scanner;

public class DoBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println((int)(Math.ceil(Math.log(N)/Math.log(2))));
    }
}





