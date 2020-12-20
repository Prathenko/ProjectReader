
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int array[] = new int[size1];
        int size2 = scanner.nextInt();
        int array2[] = new int[size2];
        for (int i = 0; i < size1; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
            int answer = Arrays.binarySearch(array, array2[i]);
            if (answer >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }


}


