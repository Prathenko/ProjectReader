import java.util.Scanner;


public class  Fiban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 40) {
            int a = 1;
            int b = 1;
            int c = 2;
            int i = 2;
            int g = 0;
            int[] mass = new int[n];
            if (n == 1) {
                System.out.println(1);
            } else {
                System.out.print(1 + " " + 1);
                while (i < n) {
                    a = b;
                    b = c;
                    c = a + b;
                    mass[g] = c;
                    g = g +1;
                    i++;
                    System.out.print(" " + mass);

                }
            }
        }
             else{
                    System.out.println("No-no-no");
                }
            }
        }
